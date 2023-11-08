import React from "react";
import CartItem from "./CartItem";
import { Button } from "@mui/material";
import { useNavigate } from "react-router-dom";

const Cart = () => {
  const navigate = useNavigate();
  const handleCheckOut = () => {
      navigate("/checkout?step=2")
  } 
  return (
    <div className="">
      <div className="lg:grid grid-cols-3 lg:px-16 relative">
        <div className="col-span-2">
        {[1,1,1,1,1].map((item) => <CartItem/>)}
        </div>

        <div className="px-5 sticky top-0 h-[100vh] mt-5 lg:mt-7">
        <div className="">
            <p className="uppercase font-bold opacity-60">Price details</p>
            <hr />
            <div className="space-y-3 font-semibold">
               <div className="flex justify-between pt-3 text-black">
                  <span>Price</span>
                  <span>$6789</span>
               </div>
               {/* discount */}
               <div className="flex justify-between pt-3 text-black">
                  <span>Discount</span>
                  <span className="text-green-600">$6789</span>
               </div>
               {/* Delevery charge */}
               <div className="flex justify-between pt-3 text-black">
                  <span>Delivery Charge</span>
                  <span className="text-green-600">Free</span>
               </div>

               <div className="flex justify-between pt-3 font-bold text-black">
                  <span className="font-bold">Total Amount</span>
                  <span className="text-green-600">$6789</span>
               </div>
            </div>
            <div className="mt-7">
            <Button
            onClick={handleCheckOut}
             className="mt-12 w-full" variant="contained" sx={{background:"#7710ed",px:"3rem",py:"0.7rem",mt:"1rem"}}>check out</Button>
               
            </div>
            
            
        </div>

      </div>
        
      </div>
     
    </div>
  );
};

export default Cart;
