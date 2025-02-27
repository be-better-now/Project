<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    .header {
        background-color: #ffffff;
        padding: 1rem 0;
        width: 100%;
        top: 0;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    }

    .container {
        max-width: 1200px;
        margin: 0 auto;
        padding: 0 1rem;
        
        text-align: center;
    }

    .logo {
        font-size: 3rem;
        font-weight: bold;
        text-transform: uppercase;
        color: #008000;
        display: block;
        font-family: 'Dancing Script', cursive;
        text-decoration: none; 
    }

    .tagline {
        font-size: 0.8rem;
        color: #555;
        font-family: 'Arial', sans-serif;
    }

    .nav {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top: 0.5rem;
    }

    .menu {
        display: flex;
        list-style: none;
        gap: 1.5rem;
        font-family: 'Arial', sans-serif;
    }

    .menu-item {
        position: relative;
    }

    .menu-item a {
        color: #333;
        text-decoration: none;
        font-size: 1rem;
        padding: 10px;
        transition: color 0.3s ease;
    }

    .menu-item a:hover {
        color: #008000;
    }

    .dropdown {
        display: none;
        position: absolute;
        background-color: #ffffff;
        min-width: 200px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        z-index: 1000;
    }

    .menu-item:hover .dropdown {
        display: block;
    }

    .dropdown a {
        display: block;
        padding: 10px;
        color: #333;
        text-decoration: none;
        transition: background 0.3s ease;
    }

    .dropdown a:hover {
        background-color: #f0f0f0;
    }

    .search-bar {
        display: flex;
        align-items: center;
        background: #fff;
        border-radius: 20px;
        padding: 0.5rem 1rem;
        border: 1px solid #008000;
        margin-left: 1rem;
    }

    .search-input {
        border: none;
        outline: none;
        padding: 0.2rem;
        width: 200px;
    }

    .search-button {
        background: none;
        border: none;
        cursor: pointer;
        color: #008000;
        font-size: 1.2rem;
    }

    .cart-container {
        position: relative;
        display: inline-block;
    }

    .cart-dropdown {
    position: absolute;
    right: 0;
    top: 100%;
    background: #227a50; /* Màu nền xanh đậm */
    width: 260px;
    padding: 15px;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
    border-radius: 8px;
    opacity: 0;
    visibility: hidden;
    transition: opacity 0.3s ease, visibility 0.3s ease;
    pointer-events: none;
    color: white;
    text-align: center;
    }
    
    .cart-container:hover .cart-dropdown,
    .cart-dropdown:hover {
        opacity: 1;
        visibility: visible;
        pointer-events: auto;
    }



    /* Biểu tượng túi hàng */
    .cart-dropdown .cart-icon-big {
        font-size: 4rem;
        opacity: 0.5;
    }

    /* Nút quay lại cửa hàng */
    .cart-dropdown .back-to-shop {
        display: inline-block;
        background: #3cc480; /* Màu xanh nhạt hơn */
        padding: 10px;
        border-radius: 6px;
        text-decoration: none;
        color: white;
        font-weight: bold;
        margin-top: 10px;
        transition: background 0.3s ease;
    }

    .cart-dropdown .back-to-shop:hover {
        background: #2fa267;
    }
    
    .login-button {
        background: #008000;
        color: white;
        margin: 0;
        padding: 8px 15px;
        border-radius: 2px;
        font-weight: bold;
        text-decoration: none;
        transition: background 0.3s ease;
    }

    .login-button:hover {
        background: #006600;
    }

    
</style>

<header class="header">
    <div class="container">
        <a href="#" class="logo">DESERT ROSE SHOP</a>
        <p class="tagline">"Where emotions bloom from every Bouquet"</p>
        <nav class="nav">
            <ul class="menu">
                <li class="menu-item"><a href="#">Trang chủ</a></li>
                <li class="menu-item">
                    <a href="#">Sản phẩm ▾</a>
                    <div class="dropdown">
                        <a href="#">Hoa Sinh Nhật</a>
                        <a href="#">Hoa Khai Trương</a>
                        <a href="#">Hoa Tốt Nghiệp</a>
                    </div>
                </li>                
                <li class="menu-item"><a href="#">Liên hệ</a></li> 
            </ul>
            <div class="search-bar">
                <input type="text" class="search-input" placeholder="Nhập hoa cần tìm...">
                <button class="search-button">🔍</button>
            </div>
            <li class="menu-item cart-container">
                    <a href="#">🛒</a>
                        <div class="cart-container">
                            
                            <div class="cart-dropdown">
                                <div class="cart-icon-big">🛍️</div>
                                <p>Chưa có sản phẩm trong giỏ hàng.</p>
                                <a href="homepage.jsp" class="back-to-shop">Quay trở lại cửa hàng</a>
                            </div>
                        </div>
            </li>
            <div class="login-container">
                <a href="login.jsp" class="login-button">Đăng nhập</a>
            </div>
        </nav>
    </div>
</header>

