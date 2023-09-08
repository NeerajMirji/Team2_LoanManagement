import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Admin from "./Admin";
import Client from './Client';
import Login from './Login';
import Registration from './Registration';
import Button from './Button';
import "bootstrap/dist/css/bootstrap.min.css";

import {createBrowserRouter, RouterProvider, } from 'react-router-dom';

const router = createBrowserRouter([
    {
        path : "/",
        element : <Registration/>
    },
    {
        path : "/admin",
        element : <Admin/>
    },
    {
        path : "/login",
        element : <Login/>
    },
    {
        path : "/client",
        element : <Client/>
    },
    {
        path : "/button",
        element : <Button/>
    }

]);

function App()
{
    return(
        <RouterProvider router = {router}/>
    );
}



export default App;