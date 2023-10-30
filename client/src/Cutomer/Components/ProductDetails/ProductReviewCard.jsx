import { Avatar, Box, Grid, Rating } from "@mui/material";
import React from "react";

export default function ProductReviewCard() {
  return (
    <div>
      <Grid container spacing={2} gap={3}>
        <Grid item xs={1}>
          <Box>
            <Avatar
              className="text-white"
              sx={{ width: 56, height: 56, backgroundColor: "9155fd" }}
            ></Avatar>
          </Box>
        </Grid>

        <Grid item xs={9}>
          <div className="space-y-2">
            <div>
              <p className="font-semibold text-lg">Appu</p>
              <p className="opacity-70">December 10 2001</p>
            </div>
          </div>

          <Rating value={4} name="half rating" readOnly precision={0.5} />
          <p className="">Lorem ipsum dolor sit amet consectetipisci th hahahaha.</p>
        </Grid>
      </Grid>
    </div>
  );
}
