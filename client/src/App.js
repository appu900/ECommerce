import logo from "./logo.svg";
import "./App.css";
import Navigation from "./Cutomer/Components/Navigation";
import HomeCarusal from "./Cutomer/Components/Carousal/HomeCarusal";
import HomePage from "./Pagess/HomePage";
import Product from "./Cutomer/Components/Product/Product";
import Productdetails from "./Cutomer/Components/ProductDetails/Productdetails";
import Cart from "./Cutomer/Components/Cart/Cart";
import CheckOut from "./Cutomer/Components/Checkout/CheckOut";
import Footer from "./Cutomer/Components/Footer";
import Order from "./Cutomer/Components/Order/Order";

function App() {

  return (
    <div>
      <Navigation />
      <div>
        {/* <HomePage/> */}
        {/* <Product /> */}
        {/* <Productdetails/> */}
        {/* <Cart/> */}
        {/* <CheckOut/> */}
        <Order/>
        <Footer/>
      </div>
    </div>
  );
}

export default App;
