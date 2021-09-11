package com.aya.financegateway.channel.swift.model.message.mt;


public class SwiftMessage {

    private SwiftBlock1 swiftBlock1;
    private SwiftBlock2 swiftBlock2;
    private SwiftBlock3 swiftBlock3;
    private SwiftBlock4 swiftBlock4;
    private SwiftBlock5 swiftBlock5;

    public SwiftBlock1 getSwiftBlock1() {
        return swiftBlock1;
    }

    public void setSwiftBlock1(SwiftBlock1 swiftBlock1) {
        this.swiftBlock1 = swiftBlock1;
    }

    public SwiftBlock2 getSwiftBlock2() {
        return swiftBlock2;
    }

    public void setSwiftBlock2(SwiftBlock2 swiftBlock2) {
        this.swiftBlock2 = swiftBlock2;
    }

    public SwiftBlock3 getSwiftBlock3() {
        return swiftBlock3;
    }

    public void setSwiftBlock3(SwiftBlock3 swiftBlock3) {
        this.swiftBlock3 = swiftBlock3;
    }

    public SwiftBlock4 getSwiftBlock4() {
        return swiftBlock4;
    }

    public void setSwiftBlock4(SwiftBlock4 swiftBlock4) {
        this.swiftBlock4 = swiftBlock4;
    }

    public SwiftBlock5 getSwiftBlock5() {
        return swiftBlock5;
    }

    public void setSwiftBlock5(SwiftBlock5 swiftBlock5) {
        this.swiftBlock5 = swiftBlock5;
    }

    @Override
    public String  toString() {
        return "SwiftMessage{" +
                "swiftBlock1=" + swiftBlock1 +
                ", swiftBlock2=" + swiftBlock2 +
                ", swiftBlock3=" + swiftBlock3 +
                ", swiftBlock4=" + swiftBlock4 +
                ", swiftBlock5=" + swiftBlock5 +
                '}';
    }
}
