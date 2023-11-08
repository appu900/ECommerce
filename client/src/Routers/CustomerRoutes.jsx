import React from "react";
import { Route, Routes } from "react-router-dom";
import HomePage from "../Pagess/HomePage";
import Cart from "../Cutomer/Components/Cart/Cart";
import Product from "../Cutomer/Components/Product/Product";
import Productdetails from "../Cutomer/Components/ProductDetails/Productdetails";
import Checkout from "../Cutomer/Components/Checkout/CheckOut";
import Order from "../Cutomer/Components/Order/Order";
import OrderDetail from "../Cutomer/Components/Order/OrderDetail";

const CustomerRoutes = () => {
  return (
    <div>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/cart" element={<Cart />} />
        <Route path="/:levelOne/:levelTwo/:levelThree" element={<Product />} />
        <Route path="/product/:productId" element={<Productdetails />} />
        <Route path="/product/:productId" element={<Productdetails />} />
        <Route path="/checkout" element={<Checkout />} />
        <Route path="/account/order" element={<Order />} />
        <Route path="/account/order/:orderId" element={<OrderDetail />} />




     
     
        {/* <Footer/> */}
      </Routes>
    </div>
  );
};

export default CustomerRoutes;
