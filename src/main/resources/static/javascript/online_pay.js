
// document.addEventListener("DOMContentLoaded", function() {
//     var paymentMethodRadios = document.querySelectorAll('input[name="payment-method"]');
//     var paymentDetailsDiv = document.getElementById("payment-details");
  
//     for (var i = 0; i < paymentMethodRadios.length; i++) {
//       paymentMethodRadios[i].addEventListener("change", function() {
//         if (this.value === "phonepay" || this.value === "googlepay" || this.value === "paytm") {
//           paymentDetailsDiv.style.display = "block";
//         } else {
//           paymentDetailsDiv.style.display = "none";
//         }
//       });
//     }

//   });
  

document.addEventListener("DOMContentLoaded", function() {
  var paymentMethodRadios = document.querySelectorAll('input[name="payment-method"]');
  var paymentDetailsDiv = document.getElementById("payment-details");
  var orderForm = document.getElementById("order-form"); // Add this line to reference the order form

  for (var i = 0; i < paymentMethodRadios.length; i++) {
    paymentMethodRadios[i].addEventListener("change", function() {
      if (this.value === "phonepay" || this.value === "googlepay" || this.value === "paytm") {
        paymentDetailsDiv.style.display = "block";
      } else {
        paymentDetailsDiv.style.display = "none";
      }
    });
  }

  orderForm.addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission to control behavior
    alert("Order placed successfully!");
    orderForm.reset();
  });
});


  

