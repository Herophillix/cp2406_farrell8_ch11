package PhoneCall;

public class OutgoingPhoneCall extends PhoneCall {
    private int minute;

    public OutgoingPhoneCall(String phoneNumber, int minute) {
        super(phoneNumber, 0.02);
        SetMinute(minute);
    }

    public int GetMinute() { return minute; }

    private void SetMinute(int minute) { this.minute = minute; }

    @Override
    public String toString() {
        return super.toString() + " OutgoingPhoneCall{" +
                "minute=" + minute +
                '}';
    }
}
