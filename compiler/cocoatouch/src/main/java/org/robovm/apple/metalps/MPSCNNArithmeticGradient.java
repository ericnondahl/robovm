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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNArithmeticGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNGradientKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNArithmeticGradientPtr extends Ptr<MPSCNNArithmeticGradient, MPSCNNArithmeticGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNArithmeticGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNArithmeticGradient() {}
    protected MPSCNNArithmeticGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNArithmeticGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNArithmeticGradient(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithCoder:")
    public MPSCNNArithmeticGradient(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryScale")
    public native float getPrimaryScale();
    @Property(selector = "setPrimaryScale:")
    public native void setPrimaryScale(float v);
    @Property(selector = "secondaryScale")
    public native float getSecondaryScale();
    @Property(selector = "setSecondaryScale:")
    public native void setSecondaryScale(float v);
    @Property(selector = "bias")
    public native float getBias();
    @Property(selector = "setBias:")
    public native void setBias(float v);
    @Property(selector = "secondaryStrideInFeatureChannels")
    public native @MachineSizedUInt long getSecondaryStrideInFeatureChannels();
    @Property(selector = "setSecondaryStrideInFeatureChannels:")
    public native void setSecondaryStrideInFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "minimumValue")
    public native float getMinimumValue();
    @Property(selector = "setMinimumValue:")
    public native void setMinimumValue(float v);
    @Property(selector = "maximumValue")
    public native float getMaximumValue();
    @Property(selector = "setMaximumValue:")
    public native void setMaximumValue(float v);
    @Property(selector = "isSecondarySourceFilter")
    public native boolean isSecondarySourceFilter();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
