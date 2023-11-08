import { Grid } from '@mui/material'
import React from 'react'
import OrderCard from './OrderCard'

const orderStatus = [
  {label:"On the Way", value:"on-the-way"},
  {label:"Delivered", value:"delevered"},
  {label:"Cancelled", value:"cancelled"},
  {label:"Return", value:"returnrd"},
]

export default function Order() {
  return (
    <div className='lg:px-32 px-5'>
      <Grid container sx={{justifyContent:"space-between"}} className=''>

           <Grid item xs={2.5}>
            <div className='h-auto shadow-lg bg-white p-5 sticky top-5'>
              <h1 className='font-bold text-lg'>Filter</h1>
              <div className='space-y-4 mt-10'>
                <h1 className='font-semibold uppercase'>order status</h1>

                  {
                    orderStatus.map((Option)=> <div className='flex items-center'>
                    <input defaultValue={Option.value} type="checkbox" className='h-4 w-5 border-gray-300 text-indigo-600  focus:ring-indigo-500' />
                    <label
                    className='ml-3 text-sm text-gray-600'
                    htmlFor="option.value">{Option.label}</label>
                  </div>)
                  }

              </div>
            </div>
           </Grid>
           <Grid item xs={9}>
            <div className='space-y-7'>
              {
              [1,1,1,1,1,].map((item)=><OrderCard/>)
              }
            </div>
           </Grid>


      </Grid>
    </div>
  )
}
