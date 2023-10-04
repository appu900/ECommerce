import { Button, Grid, Typography } from "@mui/material";
import React from "react";

const Footer = () => {
  return (
    <div>
      <Grid
        className="bg-black text-white text-sm text-center mt-10"
        container
        sx={{ backgroundColor: "black", color: "white", py: 3 }}
      >
        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5 underline text-sm " variant="h6">
            Company
          </Typography>
          <div className="flex flex-col text-left">
            <Button className="pb-5 text-left" variant="h6" gutterBottom>
              About
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Blog
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Press
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Invester
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              location
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              India
            </Button>
          </div>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5 underline " variant="h6">
            Solutions
          </Typography>
          <div className="flex flex-col text-left">
            <Button className="pb-5 text-left" variant="h6" gutterBottom>
              About
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Blog
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Press
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Invester
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              location
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              India
            </Button>
          </div>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5 underline " variant="h6">
            Marketing
          </Typography>
          <div className="flex flex-col text-left">
            <Button className="pb-5 text-left" variant="h6" gutterBottom>
              About
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Blog
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Press
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Invester
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              location
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              India
            </Button>
          </div>
        </Grid>

        <Grid item xs={12} sm={6} md={3}>
          <Typography className="pb-5 underline " variant="h6">
            About us
          </Typography>
          <div className="flex flex-col text-left">
            <Button className="pb-5 text-left" variant="h6" gutterBottom>
              About
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Blog
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Press
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              Invester
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              location
            </Button>
            <Button className="pb-5" variant="h6" gutterBottom>
              India
            </Button>
          </div>
        </Grid>
      </Grid>
    </div>
  );
};

export default Footer;
