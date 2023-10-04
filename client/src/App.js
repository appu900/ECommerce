import logo from "./logo.svg";
import "./App.css";
import Navigation from "./Cutomer/Components/Navigation";
import HomeCarusal from "./Cutomer/Components/Carousal/HomeCarusal";
import HomePage from "./Pagess/HomePage";

function App() {
  return (
    <div>
      <Navigation />
      <div>
        <HomePage/>
      </div>
    </div>
  );
}

export default App;
