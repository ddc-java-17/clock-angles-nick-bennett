/*
 *  Copyright 2024 CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive;

/**
 * Defines 2 static methods, {@link #hourHandDegrees(int, double)} and {@link
 * #minuteHandDegrees(double)}. These methods return the angle swept out from the 12 o'clock
 * position to the hour and minute hands, respectively, at a specified time. Implementation of these
 * methods is included in the assignments, extra credit opportunities, or practical exam problems of
 * the Deep Dive Coding Java training programs.
 */
public abstract class ClockAngles {

  private ClockAngles() {
    // NOTE: There is NO need to do anything with this constructor! The methods you will implement
    // in this class are static; thus, there is no need to create instances of this class.
  }

  /**
   * Computes and returns the angle made by the hour hand, measured in degrees clockwise from
   * straight up (12 o'clock on the clock face), in the interval [0, 360).
   *
   * @param hours   Hour component of time, in {0, 1, &hellip;, 23}.
   * @param minutes Minute component of time, in [0-60).
   * @return        Angle (in degrees) to which hour hand is oriented.
   */
  public static double hourHandDegrees(int hours, double minutes) {
    throw new UnsupportedOperationException("Not yet implemented"); // TODO Implement as specified.
  }

  /**
   * Computes and returns the angle made by the minute hand, measured in degrees clockwise from
   * straight up (12 o'clock on the clock face), in the interval [0, 360).
   *
   * @param minutes Minute component of time, in [0, 60).
   * @return        Angle (in degrees) to which minute hand is oriented.
   */
  public static double minuteHandDegrees(double minutes) {
    throw new UnsupportedOperationException("Not yet implemented"); // TODO Implement as specified.
  }

}
