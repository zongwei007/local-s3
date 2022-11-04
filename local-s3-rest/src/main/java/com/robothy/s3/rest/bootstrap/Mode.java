package com.robothy.s3.rest.bootstrap;

public enum Mode {

  /**
   * Persist the data.
   */
  PERSIST,

  /**
   * Store data in memory. Data will be lost after restart the service.
   */
  IN_MEMORY
}