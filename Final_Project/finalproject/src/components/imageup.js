import React, { useState, useEffect } from 'react';
const Imgup = () => {
    const [file, setFile] = useState(null); // State to store selected image file

    const handleSubmit = async (e) => {
        e.preventDefault();

        const formData = new FormData();
        formData.append("file", file);
        const uploadResponse = fetch(`http://localhost:8080/uploadImage/39`, {
            method: 'POST',
            body: formData
});
};
return (
    <div>
        <form onSubmit={handleSubmit}>

            <div className="mb-3">
                <label htmlFor="image" className="form-label">
                    Image
                </label>
                <input
                    type="file"
                    className="form-control"
                    id="image"
                    name="image"
                    onChange={(e) => setFile(e.target.files[0])}
                    required
                />
            </div>
            <input type='submit' />
        </form>
    </div>
);
};
export default Imgup;