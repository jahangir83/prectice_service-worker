if('serviceWorker' in navigator){
   navigator.serviceWorker
        .register('../sw-cach-page.js')
        .then(reg => {
            console.log("register successfully work");
        })
        .catch(err => {console.log(err)} ) 
}  