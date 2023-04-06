package day09.quiz;

public class IPhone extends SmartPhone {
    @Override
    public String information() {


        return takePicture() + makeCall() ;
    }

    @Override
    public String takePicture() {
        return String.format("아이폰은 %s에서 만들어졌고 제원은 다음과 같다.", getModel());
    }

    @Override
    public String makeCall() {
        return String.format("번호를 누르고 통화버튼을 누름");
    }

    @Override
    public String takeCall() {
        return String.format("전화받기 버튼을 누름");
    }

    @Override
    public String charge() {
        return String.format("1200만, 1600만 트리플 카메라\n" +
                "고속충전, 고숙 무선 충전\n" +
                "정전식");
    }
}
