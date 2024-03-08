package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class ClockAnglesTest {

  private static final double TOLERANCE = 1d / 3600;

  @ParameterizedTest
  @CsvFileSource(
      resources = {"hour-hand-degrees-normalized.csv", "hour-hand-degrees-non-normalized.csv"},
      useHeadersInDisplayName = true
  )
  void hourHandDegrees(int hours, double minutes, double expected) {
    assertEquals(expected, ClockAngles.hourHandDegrees(hours, minutes), TOLERANCE);
  }

  @ParameterizedTest
  @CsvFileSource(
      resources = {"minute-hand-degrees-normalized.csv", "minute-hand-degrees-non-normalized.csv"},
      useHeadersInDisplayName = true
  )
  void minuteHandDegrees(double minutes, double expected) {
    assertEquals(expected, ClockAngles.minuteHandDegrees(minutes), TOLERANCE);
  }

}