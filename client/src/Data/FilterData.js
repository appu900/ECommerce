// export const color = [
//     "white",
//     "black",
//     "blue",
//     "red",
//     "yellow",
//     "green",
//     "pink",
// ]


export const FilterData = [
    {
        id:"color",
        name:"Color",
        options:[
            {value:"white",label:"White"},
            {value:"beige",label:"Beige"},
            {value:"blue",label:"Blue"},
            {value:"brown",label:"Brown"},
            {value:"green",label:"Green"},
            {value:"purple",label:"Purple"},
            {value:"yellow",label:"Yellow"},
        ],

    },
    {
        id:"size",
        name:"Size",
        options:[
            {value:"s",label:"S"},
            {value:"m",label:"M"},
            {value:"l",label:"L"},
            {value:"x",label:"X"},
            {value:"xx",label:"XX"},
        ],
    },

];


export const filters = [
    {
        id:"price",
        name:"Price",
        options:[
            {
                value:"159-399",label:"₹159.00 - ₹399.00",
            },
            {value:"399-999",label:"₹399.00 - ₹639.00"},
            {value:"399-999",label:"₹399.00 - ₹999.00"},
            {value:"999-1999",label:"₹999.00 - ₹1999.00"},
            {value:"1999-2999",label:"₹1999.00 - ₹2999.00"},
            {value:"2999-3999",label:"₹2999.00 - ₹3999.00"},

        ],
    },

    {
        id:"discount",
        name:"Offers",
        options:[
            {value:"10",label:"10% And Above"},
            {value:"30",label:"30% And Above"},
            {value:"40",label:"40% And Above"},
            {value:"50",label:"50% And Above"},
            {value:"60",label:"60% And Above"},
            {value:"70",label:"70% And Above"},
        ],
    }
]