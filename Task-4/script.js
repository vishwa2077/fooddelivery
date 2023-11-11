// script.js
document.addEventListener("DOMContentLoaded", function () {
    const cart = [];
    const menuItems = document.querySelectorAll(".menu-item");
    const cartItems = document.getElementById("cart-items");
    const cartTotal = document.getElementById("cart-total");

    menuItems.forEach((menuItem) => {
        const addToCartButton = menuItem.querySelector(".add-to-cart");
        addToCartButton.addEventListener("click", () => {
            const name = menuItem.querySelector("h3").textContent;
            const price = menuItem.querySelector(".price").textContent;
            cart.push({ name, price });
            updateCart();
        });
    });

    function updateCart() {
        cartItems.innerHTML = "";
        let total = 0;

        cart.forEach((item) => {
            const listItem = document.createElement("li");
            listItem.textContent = `${item.name} - ${item.price}`;
            cartItems.appendChild(listItem);
            total += parseFloat(item.price.slice(1));
        });

        cartTotal.textContent = `$${total.toFixed(2)}`;
    }

    const checkoutButton = document.getElementById("checkout");
    checkoutButton.addEventListener("click", () => {
        alert("Thank you for your order!");
        cart.length = 0; // Clear the cart
        updateCart();
    });
});
