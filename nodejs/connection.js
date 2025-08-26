const mongo=require('mongoose');
require('dotenv').config();

const promise=mongo.connect(process.env.MongodbConnection);
promise.then(()=>{console.log("Connected to the Database")});
promise.catch((err)=>console.log(err));
