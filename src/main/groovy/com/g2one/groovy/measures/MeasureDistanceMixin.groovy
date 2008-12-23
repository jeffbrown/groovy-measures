package com.g2one.groovy.measures

import javax.measure.Measure
import javax.measure.unit.NonSI
import javax.measure.unit.SI

class MeasureDistanceMixin {

    static getKilometers(Measure self) {
        self.doubleValue(SI.KILO(SI.METER))
    }

    static getMeters(Measure self) {
        self.doubleValue(SI.METER)
    }

    static getCentimeters(Measure self) {
        self.doubleValue(SI.CENTI(SI.METER))
    }

    static getNanometers(Measure self) {
        self.doubleValue(SI.NANO(SI.METER))
    }

    static getMillimeters(Measure self) {
        self.doubleValue(SI.MILLI(SI.METER))
    }

    static getMicrometers(Measure self) {
        self.doubleValue(SI.MICRO(SI.METER))
    }
    
    static getMiles(Measure self) {
        self.doubleValue(NonSI.MILE)
    }

    static getFurlongs(Measure self) {
        self.doubleValue(NonSI.YARD) / 220
    }
    
    static getYards(Measure self) {
        self.doubleValue(NonSI.YARD)
    }

    static getFeet(Measure self) {
        self.doubleValue(NonSI.FOOT)
    }

    static getInches(Measure self) {
        self.doubleValue(NonSI.INCH)
    }

    static plus(Measure self, Measure other) {
        // TODO there must be something in JScience to support adding Measures...
        def selfInMeters = self.doubleValue(SI.METER)
        def otherInMeters = other.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters + otherInMeters, SI.METER)
    }
    
    static minus(Measure self, Measure other) {
        // TODO there must be something in JScience to support subtracting Measures...
        def selfInMeters = self.doubleValue(SI.METER)
        def otherInMeters = other.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters - otherInMeters, SI.METER)
    }
    
    static multiply(Measure self, Number number) {
        def selfInMeters = self.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters * number, SI.METER)
    }
    
    static div(Measure self, Number number) {
        def selfInMeters = self.doubleValue(SI.METER)
        Measure.valueOf(selfInMeters / number, SI.METER)
    }
}