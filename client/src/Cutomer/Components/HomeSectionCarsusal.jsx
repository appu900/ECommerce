import React from "react";
import AliceCarousel from "react-alice-carousel";
import "react-alice-carousel/lib/alice-carousel.css";
import HomeCard from "./HomeCard";
import { Button } from "@mui/material";
import ChevronRightIcon from "@mui/icons-material/ChevronRight";
import KeyboardArrowRightIcon from "@mui/icons-material/KeyboardArrowRight";
import KeyboardArrowLeftIcon from "@mui/icons-material/KeyboardArrowLeft";
import { mens_kurta } from "../../Data/Men/men_kurta";


const HomeSectionCarsusal = ({ data,sectionname }) => {
  const responsive = {
    0: { items: 2 },
    720: { items: 3 },
    1024: { items: 5.5 },
  };

  const [activeIndex, setActiveIndex] = React.useState(0);
  const slidePrev = () => {
    setActiveIndex(activeIndex - 1);
  };

  const slideNext = () => {
    setActiveIndex(activeIndex + 1);
  };
  const syncActiveIndex = ({ item }) => setActiveIndex(item);

  const items = data.slice(0, 15).map((item) => <HomeCard product={item} />);

  return (
    <div className="relative px-4 lg:px-8 ">
      <h2 className="text-2xl font-bold uppercase lg:px-14 text-gray-700 py-5">{sectionname}</h2>
      <div className="relative p-5">
        <AliceCarousel
          className=""
          items={items}
          disableButtonsControls
          // autoPlay
          // autoPlayInterval={3000}
          responsive={responsive}
          controlsStrategy="alternate"
          disableDotsControls
          onSlideChanged={syncActiveIndex}
          activeIndex={activeIndex}
        />
        <Button
          onClick={slideNext}
          variant="outlined"
          className="z-50 bg-white"
          aria-label="next"
          sx={{
            position: "absolute",
            top: "8rem",
            right: "-0rem",
            transform: "translateX(50%) rotate(90deg)",
          }}
        >
          <KeyboardArrowRightIcon
            sx={{ transform: "rotate(-90deg)", color: "black" }}
          />
        </Button>

        <Button
          onClick={slidePrev}
          variant="outlined"
          className="z-50 bg-white"
          aria-label="next"
          sx={{
            position: "absolute",
            top: "8rem",
            left: "-3rem",
            transform: "translateX(50%) rotate(90deg)",
          }}
        >
          <KeyboardArrowLeftIcon
            sx={{ transform: "rotate(-90deg)", color: "black" }}
          />
        </Button>
      </div>
    </div>
  );
};

export default HomeSectionCarsusal;
