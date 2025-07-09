document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('signupForm');

    form.addEventListener('submit', function(e) {
        e.preventDefault();

        const name = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;

        // 입력값 검증
        if (!validateInput(name, email, password)) {
            return;
        }

        alert('회원가입이 완료되었습니다!');
        form.submit();
    });
});

function validateInput(name, email, password) {
    // 이름 검증
    if (name.length < 2) {
        alert('이름은 2글자 이상이어야 합니다.');
        return false;
    }

    // 이메일 검증
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert('유효한 이메일 주소를 입력해주세요.');
        return false;
    }

    // 비밀번호 검증
    if (password.length < 8) {
        alert('비밀번호는 8자 이상이어야 합니다.');
        return false;
    }

    return true;
}

// 입력 필드 애니메이션 효과
const inputs = document.querySelectorAll('input');
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