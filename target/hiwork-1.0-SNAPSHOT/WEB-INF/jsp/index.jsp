<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <!--====== Required meta tags ======-->
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!--====== Title ======-->
        <title>Unfold</title>

        <!--====== Favicon Icon ======-->
        <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.png"/>" type="image/png">

        <!--====== Bootstrap css ======-->
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">

        <!--====== Line Icons css ======-->
        <link rel="stylesheet" href="<c:url value="/resources/css/LineIcons.css"/>">

        <!--====== Magnific Popup css ======-->
        <link rel="stylesheet" href="<c:url value="/resources/css/magnific-popup.css"/>">

        <!--====== Default css ======-->
        <link rel="stylesheet" href="<c:url value="/resources/css/default.css"/>">

        <!--====== Style css ======-->
        <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
    </head>

    <body>
         <!--====== PRELOADER PART START ======-->

    <div class="preloader">
        <div class="loader_34">
            <div class="ytp-spinner">
                <div class="ytp-spinner-container">
                    <div class="ytp-spinner-rotator">
                        <div class="ytp-spinner-left">
                            <div class="ytp-spinner-circle"></div>
                        </div>
                        <div class="ytp-spinner-right">
                            <div class="ytp-spinner-circle"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--====== PRELOADER ENDS START ======-->
        
    <!--====== HEADER PART START ======-->

    <header id="home" class="header-area">
        <div class="navigation fixed-top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <nav class="navbar navbar-expand-lg">
                            <a class="navbar-brand" href="index.jsp">
                                <img src="<c:url value="/resources/images/logo.png"/>" alt="Logo">
                            </a> <!-- Logo -->
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="toggler-icon"></span>
                                <span class="toggler-icon"></span>
                                <span class="toggler-icon"></span>
                            </button>

                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav ml-auto">
                                    <li class="nav-item active"><a class="page-scroll" href="#home">Home</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#about">About</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#service">Services</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#work">Portfolio</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#blog">Blog</a></li>
                                    <li class="nav-item"><a class="page-scroll" href="#contact">Contact</a></li>
                                </ul>
                            </div> <!-- navbar collapse -->
                        </nav> <!-- navbar -->
                    </div>
                </div> <!-- row -->
            </div> <!-- container -->
        </div> <!-- navigation -->

        <div id="parallax" class="header-content d-flex align-items-center">
            <div class="header-shape shape-one layer" data-depth="0.10">
                <img src="<c:url value="/resources/images/banner/shape/shape-1.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-tow layer" data-depth="0.30">
                <img src="<c:url value="/resources/images/banner/shape/shape-2.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-three layer" data-depth="0.40">
                <img src="<c:url value="/resources/images/banner/shape/shape-3.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-fore layer" data-depth="0.60">
                <img src="<c:url value="/resources/images/banner/shape/shape-2.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-five layer" data-depth="0.20">
                <img src="<c:url value="/resources/images/banner/shape/shape-1.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-six layer" data-depth="0.15">
                <img src="<c:url value="/resources/images/banner/shape/shape-4.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-seven layer" data-depth="0.50">
                <img src="<c:url value="/resources/images/banner/shape/shape-5.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-eight layer" data-depth="0.40">
                <img src="<c:url value="/resources/images/banner/shape/shape-3.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-nine layer" data-depth="0.20">
                <img src="<c:url value="/resources/images/banner/shape/shape-6.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="header-shape shape-ten layer" data-depth="0.30">
                <img src="<c:url value="/resources/images/banner/shape/shape-3.png"/>" alt="Shape">
            </div> <!-- header shape -->
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-5 col-lg-6">
                        <div class="header-content-right">
                            <h4 class="sub-title">Hello</h4>
                            <h1 class="title">Welcome to our website</h1>
                            <p>This is a demo version</p>
                            <a class="main-btn" href="#work">View my Work</a>
                        </div> <!-- header content right -->
                    </div>
                    
                </div> <!-- row -->
            </div> <!-- container -->
            <div class="header-social">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="header-social-icon">
                                <ul>
                                    <li><a href="#"><i class="lni-facebook-filled"></i></a></li>
                                    <li><a href="#"><i class="lni-twitter-original"></i></a></li>
                                </ul>
                            </div> <!-- header social -->
                        </div>
                    </div> <!-- row -->
                </div> <!-- container -->
            </div> <!-- header social -->
        </div> <!-- header content -->
    </header>

    <!--====== HEADER PART ENDS ======-->
    
    <!--====== jquery js ======-->
    <script src="<c:url value="/resources/js/vendor/modernizr-3.6.0.min.js" />"></script>
    <script src="<c:url value="/resources/js/vendor/jquery-1.12.4.min.js" />"></script>

    <!--====== Bootstrap js ======-->
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/popper.min.js" />"></script>

    <!--====== Magnific Popup js ======-->
    <script src="<c:url value="/resources/js/jquery.magnific-popup.min.js" />"></script>

    <!--====== Parallax js ======-->
    <script src="<c:url value="/resources/js/parallax.min.js" />"></script>

    <!--====== Counter Up js ======-->
    <script src="<c:url value="/resources/js/waypoints.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.counterup.min.js" />"></script>


    <!--====== Appear js ======-->
    <script src="<c:url value="/resources/js/jquery.appear.min.js" />"></script>

    <!--====== Scrolling js ======-->
    <script src="<c:url value="/resources/js/scrolling-nav.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.easing.min.js" />"></script>


    <!--====== Main js ======-->
    <script src="<c:url value="/resources/js/main.js" />"></script>
    
    </body>
</html>
