
function showImagePopup(imageId) {
  
  var imageSrc = document.getElementById(imageId).src;
  var imageName = document.getElementById(imageId).getAttribute('alt');

  var popup = document.createElement('div');
  popup.classList.add('popup');

  // Create a close button for the pop-up
  var closeButton = document.createElement('span');
  closeButton.classList.add('close-button');
  closeButton.textContent = 'X';

  // Create an image element inside the pop-up
  var popupImage = document.createElement('img');
  popupImage.src = imageSrc;
  popupImage.alt = imageName;

  // Append the close button and image to the pop-up
  popup.appendChild(closeButton);
  popup.appendChild(popupImage);

  document.body.appendChild(popup);

  closeButton.addEventListener('click', function() {
    popup.remove();
  });
}

