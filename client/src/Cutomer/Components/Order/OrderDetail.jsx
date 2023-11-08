import React from "react";
import Adresscard from "../Adresscard/Adresscard";
import OrderTracker from "./OrderTracker";
import { Box, Grid } from "@mui/material";
import { deepPurple } from "@mui/material/colors";
import { StarIcon } from "@heroicons/react/24/outline";

const OrderDetail = ({}) => {
  return (
    <div className="lg:px-32 px-5 ">
      <div>
        <h1 className="font-bold text-lg py-10">Dilivrey Address</h1>
        <Adresscard />
        <div className="py-20 shadow-lg mt-10 border rounded-lg">
          <OrderTracker />
        </div>
        <Grid container className="space-y-5">
            {[1,1,1,1,1].map((item)=><Grid sx={{alignItems:"center",justifyContent:"space-between"}} item container className="shadow-xl rounded-md p-5 border">
               <Grid className="flex cursor-pointer" item xs={6}>
                <div>
                    <img className="w-[5rem] rounded h-[5rem] object-cover object-top" src="https://rukminim1.flixcart.com/image/612/612/xif0q/kurta/l/f/r/xl-k-spl668-yellow-sg-leman-original-imagznqcrahgq9rf.jpeg?q=70" alt="" />
                </div>
                <div className="space-y-1 ml-5">
                    <p className="font-semibold text-gray-500">Mens kurta</p>
                    <p className="space-x-5 opacity-60"><span>Color : yellow, </span> Size : s</p>
                    <p className="font-semibold text-green-600">$9999</p>
                   
                </div>
               </Grid>

                <Grid item>
                    <Box sx={{color:deepPurple[500]}} className=" flex items-center">
                        <StarIcon sx={{fontSize:"3px"}} className="px-2 text-5xl h-[20px]"/>
                        <span>Rate and review Product</span>
                    </Box>

                </Grid>
            </Grid>)}
            
        </Grid>

      </div>
    </div>
  );
};

export default OrderDetail;
