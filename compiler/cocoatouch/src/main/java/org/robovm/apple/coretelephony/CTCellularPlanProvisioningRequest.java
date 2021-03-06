/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coretelephony;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreTelephony") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTCellularPlanProvisioningRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CTCellularPlanProvisioningRequestPtr extends Ptr<CTCellularPlanProvisioningRequest, CTCellularPlanProvisioningRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CTCellularPlanProvisioningRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CTCellularPlanProvisioningRequest() {}
    protected CTCellularPlanProvisioningRequest(Handle h, long handle) { super(h, handle); }
    protected CTCellularPlanProvisioningRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CTCellularPlanProvisioningRequest(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "address")
    public native String getAddress();
    @Property(selector = "setAddress:")
    public native void setAddress(String v);
    @Property(selector = "matchingID")
    public native String getMatchingID();
    @Property(selector = "setMatchingID:")
    public native void setMatchingID(String v);
    @Property(selector = "OID")
    public native String getOID();
    @Property(selector = "setOID:")
    public native void setOID(String v);
    @Property(selector = "confirmationCode")
    public native String getConfirmationCode();
    @Property(selector = "setConfirmationCode:")
    public native void setConfirmationCode(String v);
    @Property(selector = "ICCID")
    public native String getICCID();
    @Property(selector = "setICCID:")
    public native void setICCID(String v);
    @Property(selector = "EID")
    public native String getEID();
    @Property(selector = "setEID:")
    public native void setEID(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
