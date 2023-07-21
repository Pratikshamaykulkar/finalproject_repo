
// document.getElementById("order-form").addEventListener("submit", function(e) {
//   e.preventDefault(); 

  
//   var name = document.getElementById("name").value;
//   var address = document.getElementById("address").value;
//   var phone = document.getElementById("phone").value;
//   var food = document.getElementById("food").value;

  
//   if (name === "" || address === "" || phone === "" || food === "") {
//     alert("Please fill in all fields.");
//     return;
//   }

  
//   var successMessage = document.createElement("p");
//   successMessage.textContent = "Order placed successfully!";
//   successMessage.style.color = "Red";
//   document.getElementById("order-form").appendChild(successMessage);

  
//   document.getElementById("order-form").reset();

  
//   setTimeout(function() {
//     successMessage.remove();
//   }, 5000);
// });



document.getElementById("order-form").addEventListener("submit", function(e) {
  e.preventDefault();

  var name = document.getElementById("name").value;
  var address = document.getElementById("address").value;
  var phone = document.getElementById("phone").value;
  var food = document.getElementById("food").value;
  var paymentMode = document.querySelector('input[name="paymentMode"]:checked').value;

  if (name === "" || address === "" || phone === "" || food === "") {
    alert("Please fill in all fields.");
    return;
  }

  // Create the form data
  var formData = new FormData();
  formData.append("name", name);
  formData.append("address", address);
  formData.append("phone", phone);
  formData.append("food", food);
  formData.append("paymentMode", paymentMode);

  // Send the form data asynchronously
  fetch("/orderplaced", {
    method: "POST",
    body: formData
  })
  .then(function(response) {
    if (response.ok) {
      // Display success message
      var successMessage = document.createElement("p");
      successMessage.textContent = "Order placed successfully!";
      successMessage.style.color = "Red";
      document.getElementById("order-form").appendChild(successMessage);

      // Reset the form
      document.getElementById("order-form").reset();

      // Remove the success message after 5 seconds
      setTimeout(function() {
        successMessage.remove();
      }, 5000);
    } else {
      throw new Error("Error submitting the form.");
    }
  })
  .catch(function(error) {
    console.error(error);
    // Display an error message if there was an issue submitting the form
    alert("There was an error submitting the form. Please try again.");
  });
});
