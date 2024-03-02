import React, { useState } from 'react'

const CommentReply = (props) => {
    const [isLiked, setIsLiked] = useState(false) // initializes isLiked state to false, declares setIsLiked as function to update isLiked
    // function logic
    return(
        <div className="comment-text">
        <h5>{props.name}</h5>
        <p>{props.content}</p> 
        <p>{isLiked ? "Liked" : "Like"}</p> // conditional rendering: if isLiked is true, then display "Liked", else display "Like"

        </div>
    )
}
export default CommentReply

// parentheses allow us to write JSX inside JS