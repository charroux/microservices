// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agreementService.proto

package com.charroux.lib;

public interface CreditApplicationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.charroux.CreditApplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string firstName = 1;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 1;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string lastName = 2;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 2;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>uint32 price = 4;</code>
   * @return The price.
   */
  int getPrice();
}
