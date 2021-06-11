var image = document.getElementsByClassName("itemContainer");
var imageTitle = document.getElementById("title");
var imageThumbnail =  document.getElementsByClassName("imageThumbnail");
image.style.display = "none"

//open lightbox
function openLightbox(){
    document.getElementById("lightbox").style.display = "block";
    
    
}

//close lightbox
function closeLightbox(){
    document.getElementById("lightbox").style.display = "none";
    image[imageNum-1].style.display = "none";
    imageTitle.innerHTML = "";
}

//Check image
var imageNum = 1;
showImage(imageNum);

function currentImage(n){
    imageNum = n;
    showImage(imageNum);
}

//Show image
function showImage(n){
    image[n-1].style.display = "flex";
    document.getElementById("title").innerHTML = imageThumbnail[n-1].alt;
    console.log(imageThumbnail[n-1].alt);
}