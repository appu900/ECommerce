import logo from "./logo.svg";
import "./App.css";
import Navigation from "./Cutomer/Components/Navigation";
import HomeCarusal from "./Cutomer/Components/Carousal/HomeCarusal";
import HomePage from "./Pagess/HomePage";
import Product from "./Cutomer/Components/Product/Product";

function App() {

  return (
    <div>
      <Navigation />
      <div>
        {/* <HomePage/> */}
        <Product />
      </div>
    </div>
  );
}

export default App;
