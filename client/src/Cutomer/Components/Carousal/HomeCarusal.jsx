import React from "react";
import AliceCarousel from "react-alice-carousel";
import "react-alice-carousel/lib/alice-carousel.css";
import { HomeCarusalData } from "./HomeCarusalData";

function HomeCarausal() {
  const items = HomeCarusalData.map((item) => (
    <img className="cursor-pointer" role="presentation" src={item.image} />
  ));

  return (
    <div className="mt-14 -z-20">
      <AliceCarousel
        className=""
        items={items}
        disableButtonsControls
        autoPlay
        autoPlayInterval={2000}
        infinite
        controlsStrategy="alternate"
      />
    </div>
  );
}

export default HomeCarausal;
