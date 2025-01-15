USE sweet_delight_db

-- Insert data into Categories table
INSERT INTO Categories (id, name) VALUES
(1, 'Cakes'),
(2, 'Pastries'),
(3, 'Frence Tacos'),
(4, 'Cupcakes'),
(5, 'Cookies'),
(6, 'Crossaint')

-- Insert data into Stores table
INSERT INTO Stores (id, name, address, phone) VALUES
(1, 'Sweet Delights', '123 Bakery Lane, New York, NY', '123-456-7890'),
(2, 'Parisian Treats', '45 Avenue de France, Paris', '987-654-3210'),
(3, 'Golden Crust Bakery', '78 Golden Street, London', '555-234-5678'),
(4, 'Heavenly Bites', '101 Angel Blvd, San Francisco, CA', '444-567-8901');

-- Insert data into Products table
INSERT INTO Products (name, price, description, created_at, sales_count, rate, status, image_url, category_id, store_id) VALUES
('Chocolate Cake', 25.0, 'A rich and moist chocolate cake topped with ganache.', '2025-01-01', 120, 4.8, 'Available', 'chocolate_cake.jpg', 1, 1),
('Vanilla Buttercream Cake', 22.5, 'Classic vanilla cake layered with buttercream.', '2025-01-02', 95, 4.6, 'Available', 'vanilla_cake.jpg', 1, 1),
('Croissant', 3.0, 'Traditional French butter croissant.', '2025-01-03', 300, 4.9, 'Available', 'croissant.jpg', 3, 2),
('Éclair', 4.0, 'French choux pastry filled with cream and topped with chocolate.', '2025-01-04', 250, 4.8, 'Available', 'eclair.jpg', 3, 2),
('Macarons', 15.0, 'Box of 12 colorful French macarons.', '2025-01-05', 180, 4.7, 'Available', 'macarons.jpg', 3, 2),
('Strawberry Cupcake', 3.5, 'Cupcake with strawberry frosting and fresh strawberries.', '2025-01-06', 150, 4.5, 'Available', 'strawberry_cupcake.jpg', 4, 3),
('Red Velvet Cupcake', 3.8, 'Moist red velvet cupcake topped with cream cheese frosting.', '2025-01-07', 170, 4.6, 'Available', 'red_velvet_cupcake.jpg', 4, 3),
('Oatmeal Raisin Cookie', 2.0, 'Chewy oatmeal cookie with plump raisins.', '2025-01-08', 200, 4.4, 'Available', 'oatmeal_cookie.jpg', 5, 4),
('Chocolate Chip Cookie', 2.5, 'Classic chocolate chip cookie with gooey chips.', '2025-01-09', 220, 4.8, 'Available', 'chocolate_chip_cookie.jpg', 5, 4),
('Lemon Tart', 4.5, 'Zesty lemon tart with a buttery crust.', '2025-01-10', 140, 4.7, 'Available', 'lemon_tart.jpg', 2, 1),
('Opera Cake', 30.0, 'French layered cake with coffee and chocolate.', '2025-01-11', 100, 4.9, 'Available', 'opera_cake.jpg', 1, 2),
('Baguette', 2.8, 'Classic French baguette with a crispy crust.', '2025-01-12', 400, 4.9, 'Available', 'baguette.jpg', 3, 2),
('Cinnamon Roll', 3.2, 'Soft roll filled with cinnamon and topped with icing.', '2025-01-13', 160, 4.5, 'Available', 'cinnamon_roll.jpg', 2, 1),
('Chocolate Tart', 5.0, 'Dark chocolate tart with a crisp crust.', '2025-01-14', 130, 4.8, 'Available', 'chocolate_tart.jpg', 2, 3),
('Fruit Cake', 20.0, 'Rich cake filled with dried fruits and nuts.', '2025-01-15', 90, 4.3, 'Available', 'fruit_cake.jpg', 1, 4),
('Madeleine', 3.5, 'Small shell-shaped sponge cakes.', '2025-01-16', 110, 4.7, 'Available', 'madeleine.jpg', 3, 2),
('Carrot Cake', 24.0, 'Moist carrot cake with cream cheese frosting.', '2025-01-17', 130, 4.6, 'Available', 'carrot_cake.jpg', 1, 1),
('Blueberry Muffin', 3.0, 'Muffin filled with fresh blueberries.', '2025-01-18', 180, 4.5, 'Available', 'blueberry_muffin.jpg', 4, 3),
('Peach Pie', 15.0, 'Sweet peach pie with a lattice crust.', '2025-01-19', 70, 4.4, 'Available', 'peach_pie.jpg', 2, 4),
('Tiramisu', 28.0, 'Classic Italian dessert with coffee-soaked ladyfingers and mascarpone.', '2025-01-20', 85, 4.8, 'Available', 'tiramisu.jpg', 1, 3);
