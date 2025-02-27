-- Tạo bảng Sách
CREATE TABLE tblFlowers (
    FlowerID Char(5) PRIMARY KEY,
    FlowerName NVARCHAR(200) NOT NULL,    
    Quality NVARCHAR(100) NOT NULL,
	Category VARCHAR(100),
    Price DECIMAL(10,2),
    Quantity INT DEFAULT 0,
);

-- Thêm dữ liệu mẫu
INSERT INTO tblFlowers (FlowerID, FlowerName, Quality, Category, Price, Quantity) VALUES
('F0001', 'Bó Hoa Hồng Đỏ', 'Đơn Giản', 'Bó Hoa', 250000, 10),
('F0002', 'Lẵng Hoa Sinh Nhật Ngọt Ngào Quyến Rũ', 'Cao Cấp', 'Lẵng Hoa', 750000, 5),
('F0003', 'Bó Hoa Ruby', 'Đơn Giản', 'Bó Hoa', 200000, 8),
('F0004', 'Bó Hoa Cẩm Chướng', 'Đơn Giản', 'Bó Hoa',300000, 15),
('F0005', 'Hộp Hoa Cúc Mẫu Đơn Xanh Lá', 'Cao Cấp', 'Hộp Hoa', 600000, 12),
('F0006', 'Giỏ Hoa Gấu Bông GoodDays', 'Cao Cấp', 'Giỏ Hoa', 1000000, 20),
('F0007', 'Giỏ Hoa Thỏ Bông JellyCat Xám', 'Cao Cấp', 'Giỏ Hoa', 700000, 7),
('F0008', 'Bó Hoa Cúc Tana', 'Cao Cấp', 'Bó Hoa', 250000, 9),
('F0009', 'Lẵng Hoa Chúc Mừng Sinh Nhật Sếp Nam Đẹp', 'Cao Cấp', 'Lẵng Hoa', 800000, 6),
('F0010', 'Lẵng Hoa Cúc Mẫu Đơn Pastel', 'Cao Cấp', 'Lẵng Hoa', 1000000, 25);

-- Tạo bảng Sách
CREATE TABLE tblFlowers (
    FlowerID Char(5) PRIMARY KEY,
    FlowerName NVARCHAR(200) NOT NULL,    
    Quality NVARCHAR(100) NOT NULL,
	Category VARCHAR(100),
    Price DECIMAL(10,2),
    Quantity INT DEFAULT 0,
);

-- Thêm dữ liệu mẫu
INSERT INTO tblFlowers (FlowerID, FlowerName, Quality, Category, Price, Quantity) VALUES
('F0001', 'Bó Hoa Hồng Đỏ', 'Đơn Giản', 'Bó Hoa', 250000, 10),
('F0002', 'Lẵng Hoa Sinh Nhật Ngọt Ngào Quyến Rũ', 'Cao Cấp', 'Lẵng Hoa', 750000, 5),
('F0003', 'Bó Hoa Ruby', 'Đơn Giản', 'Bó Hoa', 200000, 8),
('F0004', 'Bó Hoa Cẩm Chướng', 'Đơn Giản', 'Bó Hoa',300000, 15),
('F0005', 'Hộp Hoa Cúc Mẫu Đơn Xanh Lá', 'Cao Cấp', 'Hộp Hoa', 600000, 12),
('F0006', 'Giỏ Hoa Gấu Bông GoodDays', 'Cao Cấp', 'Giỏ Hoa', 1000000, 20),
('F0007', 'Giỏ Hoa Thỏ Bông JellyCat Xám', 'Cao Cấp', 'Giỏ Hoa', 700000, 7),
('F0008', 'Bó Hoa Cúc Tana', 'Cao Cấp', 'Bó Hoa', 250000, 9),
('F0009', 'Lẵng Hoa Chúc Mừng Sinh Nhật Sếp Nam Đẹp', 'Cao Cấp', 'Lẵng Hoa', 800000, 6),
('F0010', 'Lẵng Hoa Cúc Mẫu Đơn Pastel', 'Cao Cấp', 'Lẵng Hoa', 1000000, 25);