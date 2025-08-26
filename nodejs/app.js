const express =require('express');
const app=express();
const db=require('./connection')
const cors=require('cors');
const router=require('./Routes/userroutes')
require('dotenv').config()


app.use(cors());
app.use(express.json());
app.use(express.urlencoded({extended:'true'}));
app.use('/',router);


app.listen(process.env.port,console.log("Server running on port 3000"));