import React from "react";
import NavBar from "./NavBar";
import Intro from "../../Intro";



const App = () => {
    return (
        <div>
            <NavBar />
            <div>
                <Intro />
                <Photos />
            </div>
            <div>
                <Post />
            </div>
        </div>
    )
}