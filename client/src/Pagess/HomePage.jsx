import React from "react";
import HomeCarausal from "../Cutomer/Components/Carousal/HomeCarusal";
import HomeCard from "../Cutomer/Components/HomeCard";
import HomeSectionCarsusal from "../Cutomer/Components/HomeSectionCarsusal";
import { mens_kurta } from "../Data/Men/men_kurta";
import Footer from "../Cutomer/Components/Footer";

const HomePage = () => {
  return (
    <div className="z-10">
      <div className="mt-10">
        <HomeCarausal />
      </div>
      <div className="space-y-10 py-10 flex flex-col justify-center ">
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
        <HomeSectionCarsusal data={mens_kurta} sectionname={"Mens kurta"} />
      </div>
      <div>
        <Footer/>
      </div>
    </div>
  );
};

export default HomePage;
