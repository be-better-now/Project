<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    .footer {
        background-color: #d4edda;
        padding: 2rem 0;
        width: 100%;
        color: #333;
        font-family: Arial, sans-serif;
    }

    .container {
        max-width: 1200px;
        margin: 0 auto;
        padding: 0 1rem;
    }

    .footer-content {
        display: flex;
        justify-content: space-between;
        flex-wrap: wrap;
    }

    .footer-section {
        flex: 1;
        margin: 1rem;
    }

    .footer-section h3 {
        color: #008000;
        margin-bottom: 1rem;
    }

    .footer-section ul {
        list-style: none;
    }

    .footer-section ul li a {
        text-decoration: none;
        color: #333;
        display: block;
        padding: 0.3rem 0;
        transition: color 0.3s ease;
    }

    .footer-section ul li a:hover {
        color: #008000;
    }

    .social-icons {
    display: flex;
    gap: 1rem;
    margin-top: 1rem;
    }

    .social-icons a {
    background: #333;
    color: #fff;
    width: 45px;
    height: 45px;
    border-radius: 50%;
    text-decoration: none;
    display: flex;
    align-items: center; /* Căn giữa theo chiều dọc */
    justify-content: center; /* Căn giữa theo chiều ngang */
    font-size: 1.5rem;
    transition: background 0.3s ease;
}

    .social-icons a:hover {
        background: #008000;
    }

    .social-icons a i {
    font-size: 22px; /* Kích thước đồng bộ */
    line-height: 1; /* Tránh khoảng trống không mong muốn */
    }

    .footer-bottom {
        text-align: center;
        padding: 1rem 0;
        background-color: #a8d5ba;
        margin-top: 1rem;
    }

    .contact-info {
        font-size: 0.9rem;
        color: #555;
    }
</style>

<footer class="footer">
    <div class="container">
        <div class="footer-content">
            <div class="footer-section">
                <h3>Shop Hoa Tươi - Desert Rose</h3>               
                <p class="contact-info">123 Đường A, Quận B, TP C</p>
                <p class="contact-info">Hotline: (84) 123 456 789</p>
            </div>
            <div class="footer-section">
                <h3>Danh mục sản phẩm</h3>
                <ul>
                    <li><a href="#">Hoa Sinh Nhật</a></li>
                    <li><a href="#">Hoa Khai Trương</a></li>
                    <li><a href="#">Hoa Tốt Nghiệp</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Chính sách</h3>
                <ul>
                    <li><a href="#">Chính Sách Trả Hàng</a></li>
                    <li><a href="#">Chính sách bảo mật</a></li>
                    <li><a href="#">Chính sách vận chuyển</a></li>
                </ul>
            </div>
            <div class="footer-section">
                <h3>Connect me</h3>
                <div class="social-icons">
                    <a href="#"><i class="fa-brands fa-facebook-f"></i></a>
                    <a href="#"><i class="fa-brands fa-twitter"></i></a>
                    <a href="#"><i class="fa-brands fa-instagram"></i></a>
                    <a href="#"><i class="fa-brands fa-tiktok"></i></a>
                </div>
            </div>
        </div>
    </div>
    <div class="footer-bottom">
        <p>© Thiết kế & Vận hành bởi Desert Rose Shop</p>
    </div>
</footer>
