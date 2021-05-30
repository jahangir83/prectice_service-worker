

const cachName = 'v1';

const cachAssets = [
    'index.html',
    'Blog.html',
    'Contact.html',
    'Home.html',
    '/css/main.css',
    '/js/main.js'


];
//call install event
self.addEventListener('install', event => {
    console.log('service worker: Installed',)

    //caches Storage
    event.waitUntil(
        caches.open(cachName)
            .then(async (cach) => {
                console.log('Service Worker: caching files',);
               await cach.addAll(cachAssets);
            })
            .then(() => self.skipWaiting())
    ); 
})

//call Actived Event

self.addEventListener('activate', event => {
    console.log("Service Worker: Activated")

    event.waitUntil(
        caches.keys().then(cachNames => {
            return Promise.all(
                cachNames.map(cache => {
                    if(cache !== cachName){
                        console.log("Service Worker: clearing old files");
                        return caches.delete(cache)
                    }
                })
            )
        }) 
    );
})

//Call Fetch Event
self.addEventListener('fetch', e => {
    console.log("Service Worker: Fetching");
    e.respondWith(
        fetch(e.request)
        .then(res => {
            //Make copy/clone of response
            const resClone = res.clone();
            //Open cahce
            caches
                .open(cachName)
                .then(cache => {
                    //Add response to cache
                    cache.put(e.request, resClone);
                });
                return res
        }).catch(err =>  caches.match(e.request).then(res => res))
    )
}) 