document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('loginForm');

    form.addEventListener('submit', function(e) {
        e.preventDefault();

        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;

        // 입력값 검증
        if (!validateInput(email, password)) {
            return;
        }

        form.submit();
    });
});

function validateInput(email, password) {
    // 이메일 검증
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert('유효한 이메일 주소를 입력해주세요.');
        return false;
    }

    // 비밀번호 검증
    if (password.length < 1) {
        alert('비밀번호를 입력해주세요.');
        return false;
    }

    return true;
}

// 입력 필드 애니메이션 효과
const inputs = document.querySelectorAll('input[type="email"], input[type="password"]');
inputs.forEach(input => {
    input.addEventListener('focus', function() {
        this.parentElement.classList.add('focused');
    });

    input.addEventListener('blur', function() {
        if (this.value === '') {
            this.parentElement.classList.remove('focused');
        }
    });
});