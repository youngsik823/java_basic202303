package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil {
    private String name;

    public Galaxy(String name) {
        this.name = name;
    }

    @Override
    public String information() {
        return null;
    }

    @Override
    public String takePicture() {
        return String.format("갤럭시는 %s에서 만들어 졌고 제원은 다음과 같다.", this.name);
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
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String charge() {
        return String.format("1300만 듀얼카메라\n" +
                "고속충전, 고속 무선 충전\n" +
                "정전식, 와콤펜 지원");
    }
}
