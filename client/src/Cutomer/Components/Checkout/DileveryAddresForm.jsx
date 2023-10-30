import { Box, Button, Grid } from '@mui/material'
import React from 'react'
import Adresscard from '../Adresscard/Adresscard'

const DileveryAddresForm = () => {
  return (
    <div className=''>
        <Grid container spacing={4}>
            <Grid className='border rounded-md shadow-md h-[30.5rem] overflow-y-scroll'>
                 <div className='p-5 py-7 border-b cursor-pointer'>
                     <Adresscard/>
                     <Button sx={{mt:2,bgcolor:"RGB(145,85,253)"}} size='large' variant='contained'>Deliver Here</Button>
                 </div>
            </Grid>

            <Grid item xs={12} lg={7}>
                <Box className="border rounded-s-md"></Box>
            </Grid>
        </Grid>
    </div>
  )
}

export default DileveryAddresForm