<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desert Rose Shop</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }
        .container {
            max-width: 1200px;
            margin: auto;
            padding: 20px;
        }
        .title {
            text-align: center;
            background-color: #008000;
            color: white;
            padding: 10px;
            font-size: 24px;
            margin-bottom: 20px;
        }
        .product-card {
            background: white;
            border-radius: 10px;
            padding: 15px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s;
        }
        .product-card:hover {
            transform: scale(1.05);
        }
        .product-card img {
            width: 100%;
            height: auto;
            border-radius: 10px;
        }
        .discount {
            position: absolute;
            top: 10px;
            left: 10px;
            background: green;
            color: white;
            padding: 5px;
            border-radius: 5px;
        }
        .product-title {
            font-size: 18px;
            font-weight: bold;
            text-align: center;
        }
        .price {
            text-align: center;
            font-size: 16px;
            color: red;
        }
        .old-price {
            text-decoration: line-through;
            color: gray;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">BÓ HOA ??P SINH NH?T</div>
        <div class="row">
            <div class="col-md-3 mb-4">
                <div class="product-card position-relative">
                    <span class="discount">-11%</span>
                    <img src="hoa1.jpg" alt="Hoa 1">
                    <p class="product-title">Hoa Bó Sinh Nh?t Amethyst Aura</p>
                    <p class="price"><span class="old-price">950,000?</span> 850,000?</p>
                </div>
            </div>
            <div class="col-md-3 mb-4">
                <div class="product-card position-relative">
                    <span class="discount">-14%</span>
                    <img src="hoa2.jpg" alt="Hoa 2">
                    <p class="product-title">Bó Hoa H?ng Love Daily Rose</p>
                    <p class="price"><span class="old-price">350,000?</span> 300,000?</p>
                </div>
            </div>
            <div class="col-md-3 mb-4">
                <div class="product-card position-relative">
                    <span class="discount">-18%</span>
                    <img src="hoa3.jpg" alt="Hoa 3">
                    <p class="product-title">Hydrangea Muse Bouquet</p>
                    <p class="price"><span class="old-price">550,000?</span> 450,000?</p>
                </div>
            </div>
            <div class="col-md-3 mb-4">
                <div class="product-card position-relative">
                    <span class="discount">-27%</span>
                    <img src="hoa4.jpg" alt="Hoa 4">
                    <p class="product-title">Sweet Baby</p>
                    <p class="price"><span class="old-price">480,000?</span> 350,000?</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
