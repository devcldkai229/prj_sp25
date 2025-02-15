<%@ page import="devcldkai.lab3.model.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Khóa Học Online - Học Mọi Lúc, Mọi Nơi</title>
    <style>
        /* Reset mặc định */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Arial', sans-serif;
            line-height: 1.6;
            color: #333;
        }

        .container {
            width: 90%;
            max-width: 1200px;
            margin: auto;
        }

        /* HEADER */
        header {
            background: #222;
            padding: 15px 0;
            color: white;
        }

        header .container {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            font-size: 24px;
            font-weight: bold;
        }

        nav ul {
            list-style: none;
            display: flex;
        }

        nav ul li {
            margin: 0 15px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
        }

        .btn {
            margin-top: 30px;
            background: #ff6600;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            transition: 0.3s;
        }

        .btn:hover {
            background: #e65c00;
        }

        /* HERO */
        .hero {
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 60px 0;
            background: beige;
        }

        .hero-content {
            display: flex;
            align-items: center;
            gap: 50px;
        }

        .hero img {
            max-width: 400px;
        }

        /* FEATURES */
        .features {
            text-align: center;
            padding: 60px 0;
        }

        .feature-list {
            display: flex;
            justify-content: center;
            gap: 30px;
        }

        .feature {
            width: 30%;
            padding: 20px;
            background: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        /* COURSES */
        .course-list {
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        /* TESTIMONIALS */
        .testimonial-list {
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        .testimonial {
            width: 40%;
            padding: 20px;
            background: #f9f9f9;
            border-radius: 5px;
        }

        /* CTA */
        .cta {
            text-align: center;
            background: #ff6600;
            color: white;
            padding: 50px 0;
        }

        footer {
            text-align: center;
            padding: 20px;
            background: #222;
            color: white;
        }

    </style>
</head>
<body>
<%
    Users users = request.getSession().getAttribute("user") != null ? (Users) request.getSession().getAttribute("user") : null;
%>
<!-- HEADER -->
<header>
    <div class="container">
        <div class="logo">E-Learning for Admin</div>
        <nav>
            <ul>
                <li><a href="#features">Add Courses</a></li>
                <li><a href="#courses">Delete Courses</a></li>
                <li><a href="#testimonials">Update Courses</a></li>
                <li><a href="#contact">Contact</a></li>
                <%if(users == null){%>
                        <li><a href="/login.jsp" class="btn">Sign in</a></li>
                <%} else  {%>
                        <li><a style="color: white; font-weight: bold" href="" class=""><%=users.getFullName()%></a></li>
                        <li><a href="/logout" class="btn">Log out</a></li>
                <%}%>
            </ul>
        </nav>
    </div>
</header>

<!-- HERO SECTION -->
<section class="hero">
    <div class="container hero-content">
        <div class="hero-text">
            <h1>Học Mọi Lúc, Mọi Nơi với <span>Khóa Học Online</span></h1>
            <p>Phát triển kỹ năng của bạn với những khóa học chất lượng từ các chuyên gia.</p>
            <a href="#" class="btn">Bắt đầu ngay</a>
        </div>
        <img src="https://img.freepik.com/free-vector/student-discount-sale-banner_52683-122376.jpg?uid=R183697344&ga=GA1.1.1565333554.1736343081&semt=ais_hybrid" alt="Khóa học online">
    </div>
</section>

<!-- FEATURES -->
<section id="features" class="features">
    <div class="container">
        <h2>Tại sao chọn chúng tôi?</h2>
        <div class="feature-list">
            <div class="feature">
                <h3>🎓 Giảng viên hàng đầu</h3>
                <p>Được hướng dẫn bởi các chuyên gia hàng đầu trong ngành.</p>
            </div>
            <div class="feature">
                <h3>💻 Học mọi lúc, mọi nơi</h3>
                <p>Truy cập nội dung khóa học trên mọi thiết bị.</p>
            </div>
            <div class="feature">
                <h3>📜 Chứng chỉ uy tín</h3>
                <p>Nhận chứng chỉ hoàn thành giúp bạn nổi bật khi xin việc.</p>
            </div>
        </div>
    </div>
</section>

<!-- COURSES -->
<section id="courses" class="courses">
    <div class="container">
        <h2>Khóa học nổi bật</h2>
        <div class="course-list">
            <div class="course">
                <h3>JavaScript Cơ Bản</h3>
                <p>Học lập trình từ đầu với JavaScript.</p>
                <a href="#" class="btn">Đăng ký</a>
            </div>
            <div class="course">
                <h3>ReactJS Nâng Cao</h3>
                <p>Xây dựng ứng dụng web chuyên nghiệp.</p>
                <a href="#" class="btn">Đăng ký</a>
            </div>
            <div class="course">
                <h3>SQL & Database</h3>
                <p>Quản lý dữ liệu hiệu quả với SQL.</p>
                <a href="#" class="btn">Đăng ký</a>
            </div>
        </div>
    </div>
</section>

<!-- TESTIMONIALS -->
<section id="testimonials" class="testimonials">
    <div class="container">
        <h2>Học viên nói gì?</h2>
        <div class="testimonial-list">
            <div class="testimonial">
                <p>"Khóa học rất tuyệt vời! Giảng viên dạy dễ hiểu và có nhiều ví dụ thực tế."</p>
                <span>- Nguyễn Văn A</span>
            </div>
            <div class="testimonial">
                <p>"Nhờ khóa học này, tôi đã có công việc mới với mức lương cao hơn!"</p>
                <span>- Trần Thị B</span>
            </div>
        </div>
    </div>
</section>

<!-- CTA -->
<section class="cta">
    <div class="container">
        <h2>Bắt đầu hành trình học tập ngay hôm nay!</h2>
        <a href="#" class="btn">Tham gia ngay</a>
    </div>
</section>

<!-- FOOTER -->
<footer id="contact">
    <div class="container">
        <p>© 2025 E-Learning. All rights reserved.</p>
        <p>Email: support@elearning.com | Hotline: 0123 456 789</p>
    </div>
</footer>

</body>
</html>
