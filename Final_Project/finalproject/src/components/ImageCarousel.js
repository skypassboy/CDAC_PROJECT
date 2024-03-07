import React from 'react';
import Slider from 'react-slick';
import 'slick-carousel/slick/slick.css';
import 'slick-carousel/slick/slick-theme.css';
import 'bootstrap/dist/css/bootstrap.min.css'; // Import Bootstrap CSS
import './ImageCarousel.css'; // Import custom CSS file for additional styling

const ImageCarousel = () => {
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 2000,
  };

  return (
    <div className="container">
      <Slider {...settings} className="custom-slider">
        <div>
          <img
            className="img-fluid custom-image"
            src="https://c4.wallpaperflare.com/wallpaper/2/979/653/room-4k-hd-for-pc-wallpaper-preview.jpg"
            alt="Image 1"
          />
        </div>
        <div>
          <img
            className="img-fluid custom-image"
            src="https://c4.wallpaperflare.com/wallpaper/124/342/449/beautifull-design-interio-wallpaper-preview.jpg"
            alt="Image 2"
          />
        </div>
        <div>
          <img
            className="img-fluid custom-image"
            src="https://imgpile.com/images/74d807a7c58a51798b68787f5b809f81.jpg"
            alt="Image 3"
          />
        </div>
      </Slider>
    </div>
  );
};

export default ImageCarousel;
