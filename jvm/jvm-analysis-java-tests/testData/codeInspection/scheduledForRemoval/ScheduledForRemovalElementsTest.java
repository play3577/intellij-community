// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import pkg.<warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>;
import static pkg.<warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.NON_ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS;
import static pkg.<warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.staticNonAnnotatedMethodInAnnotatedClass;
import static pkg.<warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.<warning descr="'ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS</warning>;
import static pkg.<warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.<warning descr="'staticAnnotatedMethodInAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInAnnotatedClass</warning>;

import pkg.NonAnnotatedClass;
import static pkg.NonAnnotatedClass.NON_ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS;
import static pkg.NonAnnotatedClass.staticNonAnnotatedMethodInNonAnnotatedClass;
import static pkg.NonAnnotatedClass.<warning descr="'ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS</warning>;
import static pkg.NonAnnotatedClass.<warning descr="'staticAnnotatedMethodInNonAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInNonAnnotatedClass</warning>;

import pkg.<warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning>;
import pkg.NonAnnotatedEnum;
import static pkg.<warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning>.NON_ANNOTATED_VALUE_IN_ANNOTATED_ENUM;
import static pkg.<warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning>.<warning descr="'ANNOTATED_VALUE_IN_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_ANNOTATED_ENUM</warning>;
import static pkg.NonAnnotatedEnum.NON_ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM;
import static pkg.NonAnnotatedEnum.<warning descr="'ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM</warning>;

import pkg.<warning descr="'pkg.AnnotatedAnnotation' is scheduled for removal">AnnotatedAnnotation</warning>;
import pkg.NonAnnotatedAnnotation;

import <warning descr="'annotatedPkg' is scheduled for removal">annotatedPkg</warning>.ClassInAnnotatedPkg;

public class ScheduledForRemovalElementsTest {
  public void test() {
    String s = <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.NON_ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS;
    <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.staticNonAnnotatedMethodInAnnotatedClass();
    <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning> annotatedClassInstanceViaNonAnnotatedConstructor = new <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>();
    s = annotatedClassInstanceViaNonAnnotatedConstructor.nonAnnotatedFieldInAnnotatedClass;
    annotatedClassInstanceViaNonAnnotatedConstructor.nonAnnotatedMethodInAnnotatedClass();
    s = NON_ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS;
    staticNonAnnotatedMethodInAnnotatedClass();

    s = <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.<warning descr="'ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS</warning>;
    <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning>.<warning descr="'staticAnnotatedMethodInAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInAnnotatedClass</warning>();
    <warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning> annotatedClassInstanceViaAnnotatedConstructor = new <warning descr="'AnnotatedClass(java.lang.String)' is scheduled for removal"><warning descr="'pkg.AnnotatedClass' is scheduled for removal">AnnotatedClass</warning></warning>("");
    s = annotatedClassInstanceViaAnnotatedConstructor.<warning descr="'annotatedFieldInAnnotatedClass' is scheduled for removal">annotatedFieldInAnnotatedClass</warning>;
    annotatedClassInstanceViaAnnotatedConstructor.<warning descr="'annotatedMethodInAnnotatedClass()' is scheduled for removal">annotatedMethodInAnnotatedClass</warning>();
    s = <warning descr="'ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_ANNOTATED_CLASS</warning>;
    <warning descr="'staticAnnotatedMethodInAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInAnnotatedClass</warning>();

    // ---------------------------------

    s = NonAnnotatedClass.NON_ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS;
    NonAnnotatedClass.staticNonAnnotatedMethodInNonAnnotatedClass();
    NonAnnotatedClass nonAnnotatedClassInstanceViaNonAnnotatedConstructor = new NonAnnotatedClass();
    s = nonAnnotatedClassInstanceViaNonAnnotatedConstructor.nonAnnotatedFieldInNonAnnotatedClass;
    nonAnnotatedClassInstanceViaNonAnnotatedConstructor.nonAnnotatedMethodInNonAnnotatedClass();
    s = NON_ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS;
    staticNonAnnotatedMethodInNonAnnotatedClass();

    s = NonAnnotatedClass.<warning descr="'ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS</warning>;
    NonAnnotatedClass.<warning descr="'staticAnnotatedMethodInNonAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInNonAnnotatedClass</warning>();
    NonAnnotatedClass nonAnnotatedClassInstanceViaAnnotatedConstructor = new <warning descr="'NonAnnotatedClass(java.lang.String)' is scheduled for removal">NonAnnotatedClass</warning>("");
    s = nonAnnotatedClassInstanceViaAnnotatedConstructor.<warning descr="'annotatedFieldInNonAnnotatedClass' is scheduled for removal">annotatedFieldInNonAnnotatedClass</warning>;
    nonAnnotatedClassInstanceViaAnnotatedConstructor.<warning descr="'annotatedMethodInNonAnnotatedClass()' is scheduled for removal">annotatedMethodInNonAnnotatedClass</warning>();
    s = <warning descr="'ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS' is scheduled for removal">ANNOTATED_CONSTANT_IN_NON_ANNOTATED_CLASS</warning>;
    <warning descr="'staticAnnotatedMethodInNonAnnotatedClass()' is scheduled for removal">staticAnnotatedMethodInNonAnnotatedClass</warning>();

    // ---------------------------------

    <warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning> nonAnnotatedValueInAnnotatedEnum = <warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning>.NON_ANNOTATED_VALUE_IN_ANNOTATED_ENUM;
    nonAnnotatedValueInAnnotatedEnum = NON_ANNOTATED_VALUE_IN_ANNOTATED_ENUM;
    <warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning> annotatedValueInAnnotatedEnum = <warning descr="'pkg.AnnotatedEnum' is scheduled for removal">AnnotatedEnum</warning>.<warning descr="'ANNOTATED_VALUE_IN_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_ANNOTATED_ENUM</warning>;
    annotatedValueInAnnotatedEnum = <warning descr="'ANNOTATED_VALUE_IN_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_ANNOTATED_ENUM</warning>;

    NonAnnotatedEnum nonAnnotatedValueInNonAnnotatedEnum = NonAnnotatedEnum.NON_ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM;
    nonAnnotatedValueInNonAnnotatedEnum = NON_ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM;
    NonAnnotatedEnum annotatedValueInNonAnnotatedEnum = NonAnnotatedEnum.<warning descr="'ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM</warning>;
    annotatedValueInNonAnnotatedEnum = <warning descr="'ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM' is scheduled for removal">ANNOTATED_VALUE_IN_NON_ANNOTATED_ENUM</warning>;
    
    // ---------------------------------

    @<warning descr="'pkg.AnnotatedAnnotation' is scheduled for removal">AnnotatedAnnotation</warning> class C1 {}
    @<warning descr="'pkg.AnnotatedAnnotation' is scheduled for removal">AnnotatedAnnotation</warning>(nonAnnotatedAttributeInAnnotatedAnnotation = "123") class C2 {}
    @<warning descr="'pkg.AnnotatedAnnotation' is scheduled for removal">AnnotatedAnnotation</warning>(<warning descr="'annotatedAttributeInAnnotatedAnnotation' is scheduled for removal">annotatedAttributeInAnnotatedAnnotation</warning> = "123") class C3 {}
    @NonAnnotatedAnnotation class C4 {}
    @NonAnnotatedAnnotation(nonAnnotatedAttributeInNonAnnotatedAnnotation = "123") class C5 {}
    @NonAnnotatedAnnotation(<warning descr="'annotatedAttributeInNonAnnotatedAnnotation' is scheduled for removal">annotatedAttributeInNonAnnotatedAnnotation</warning> = "123") class C6 {}
  }
}