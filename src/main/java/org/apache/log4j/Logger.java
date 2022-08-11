package org.apache.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.*;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

public class Logger implements org.apache.logging.log4j.Logger {

    /**
     * Logs a {@link Throwable} that has been caught to a specific logging level.
     *
     * @param level     The logging Level.
     * @param throwable the Throwable.
     */
    @Override
    public void catching(Level level, Throwable throwable) {

    }

    /**
     * Logs a {@link Throwable} that has been caught at the {@link Level#ERROR ERROR} level.
     * Normally, one may wish to provide additional information with an exception while logging it;
     * in these cases, one would not use this method.
     * In other cases where simply logging the fact that an exception was swallowed somewhere
     * (e.g., at the top of the stack trace in a {@code main()} method),
     * this method is ideal for it.
     *
     * @param throwable the Throwable.
     */
    @Override
    public void catching(Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void debug(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void debug(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level with
     * the specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void debug(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void debug(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message CharSequence to log.
     */
    @Override
    public void debug(Marker marker, CharSequence message) {

    }

    /**
     * Logs a message CharSequence at the {@link Level#DEBUG DEBUG} level including the stack trace of the
     * {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void debug(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void debug(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void debug(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#DEBUG
     * DEBUG} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level with
     * the specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void debug(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void debug(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void debug(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#DEBUG DEBUG} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void debug(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void debug(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void debug(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void debug(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void debug(Object message) {

    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void debug(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void debug(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#DEBUG
     * DEBUG} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void debug(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void debug(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void debug(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#DEBUG DEBUG} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void debug(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at debug level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs entry to a method. Used when the method in question has no parameters or when the parameters should not be
     * logged.
     *
     * @deprecated Use {@link #traceEntry()} instead which performs the same function.
     */
    @Override
    public void entry() {

    }

    /**
     * Logs entry to a method along with its parameters (consider using one of the {@code traceEntry(...)} methods instead.)
     * <p>
     * For example:
     * </p>
     * <pre>
     * public void doSomething(String foo, int bar) {
     *     LOGGER.entry(foo, bar);
     *     // do something
     * }
     * </pre>
     * <p>
     * The use of methods such as this are more effective when combined with aspect-oriented programming or other
     * bytecode manipulation tools. It can be rather tedious (and messy) to use this type of method manually.
     * </p>
     *
     * @param params The parameters to the method.
     * @deprecated Use {@link #traceEntry(String, Object...)} instead which performs the same function.
     */
    @Override
    public void entry(Object... params) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void error(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void error(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#ERROR ERROR} level with
     * the specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void error(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#ERROR ERROR} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void error(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#ERROR ERROR} level.
     *
     * @param marker  the marker data specific to this log statement.
     * @param message the message CharSequence to log.
     */
    @Override
    public void error(Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement.
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param marker  the marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void error(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement.
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param marker  the marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void error(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
     *
     * @param marker  the marker data specific to this log statement.
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void error(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#ERROR
     * ERROR} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement.
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#ERROR ERROR} level with
     * the specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void error(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#ERROR ERROR} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void error(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void error(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#ERROR ERROR} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void error(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#ERROR ERROR} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void error(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#ERROR ERROR} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void error(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message CharSequence to log.
     */
    @Override
    public void error(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void error(Object message) {

    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void error(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void error(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#ERROR
     * ERROR} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void error(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void error(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#ERROR ERROR} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void error(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#ERROR ERROR} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void error(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void error(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at error level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs exit from a method. Used for methods that do not return anything.
     *
     * @deprecated Use {@link #traceExit()} instead which performs the same function.
     */
    @Override
    public void exit() {

    }

    /**
     * Logs exiting from a method with the result. This may be coded as:
     *
     * <pre>
     * return LOGGER.exit(myResult);
     * </pre>
     *
     * @param result The result being returned from the method call.
     * @return the result.
     * @deprecated Use {@link #traceExit(Object)} instead which performs the same function.
     */
    @Override
    public <R> R exit(R result) {
        return null;
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void fatal(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void fatal(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#FATAL FATAL} level with
     * the specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void fatal(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#FATAL FATAL} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void fatal(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#FATAL FATAL} level.
     *
     * @param marker  The marker data specific to this log statement.
     * @param message the message CharSequence to log.
     */
    @Override
    public void fatal(Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    The marker data specific to this log statement.
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param marker  The marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void fatal(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    The marker data specific to this log statement.
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param marker  The marker data specific to this log statement.
     * @param message the message object to log.
     */
    @Override
    public void fatal(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#FATAL FATAL} level.
     *
     * @param marker  The marker data specific to this log statement.
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void fatal(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#FATAL
     * FATAL} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    The marker data specific to this log statement.
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#FATAL FATAL} level with
     * the specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void fatal(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#FATAL FATAL} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void fatal(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void fatal(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#FATAL FATAL} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void fatal(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#FATAL FATAL} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void fatal(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#FATAL FATAL} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void fatal(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message CharSequence to log.
     */
    @Override
    public void fatal(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void fatal(Object message) {

    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void fatal(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#FATAL FATAL} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void fatal(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#FATAL
     * FATAL} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void fatal(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void fatal(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#FATAL FATAL} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void fatal(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#FATAL FATAL} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void fatal(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at fatal level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Gets the Level associated with the Logger.
     *
     * @return the Level associate with the Logger.
     */
    @Override
    public Level getLevel() {
        return null;
    }

    /**
     * Gets the message factory used to convert message Objects and Strings/CharSequences into actual log Messages.
     * <p>
     * Since version 2.6, Log4j internally uses message factories that implement the {@link MessageFactory2} interface.
     * From version 2.6.2, the return type of this method was changed from {@link MessageFactory} to
     * {@code <MF extends MessageFactory> MF}. The returned factory will always implement {@link MessageFactory2},
     * but the return type of this method could not be changed to {@link MessageFactory2} without breaking binary
     * compatibility.
     *
     * @return the message factory, as an instance of {@link MessageFactory2}
     */
    @Override
    public <MF extends MessageFactory> MF getMessageFactory() {
        return null;
    }

    /**
     * Gets the logger name.
     *
     * @return the logger name.
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void info(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void info(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#INFO INFO} level with the
     * specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void info(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#INFO INFO} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void info(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#INFO INFO} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message CharSequence to log.
     */
    @Override
    public void info(Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void info(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void info(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void info(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#INFO
     * INFO} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#INFO INFO} level with the
     * specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void info(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#INFO INFO} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void info(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void info(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#INFO INFO} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void info(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#INFO INFO} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void info(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#INFO INFO} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void info(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#INFO INFO} level.
     *
     * @param message the message CharSequence to log.
     */
    @Override
    public void info(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void info(Object message) {

    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void info(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void info(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#INFO
     * INFO} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void info(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void info(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#INFO INFO} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void info(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#INFO INFO} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void info(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void info(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at info level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#DEBUG DEBUG} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level DEBUG, {@code false} otherwise.
     */
    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#DEBUG DEBUG} Level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level DEBUG, {@code false} otherwise.
     */
    @Override
    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the given Level.
     * <p>
     * Note that passing in {@link Level#OFF OFF} always returns {@code true}.
     * </p>
     *
     * @param level the Level to check
     * @return boolean - {@code true} if this Logger is enabled for level, {@code false} otherwise.
     */
    @Override
    public boolean isEnabled(Level level) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the given Level and Marker.
     *
     * @param level  The Level to check
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level and marker, {@code false} otherwise.
     */
    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#ERROR ERROR} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#ERROR ERROR}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#ERROR ERROR} Level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#ERROR ERROR}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isErrorEnabled(Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#FATAL FATAL} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#FATAL FATAL}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isFatalEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#FATAL FATAL} Level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#FATAL FATAL}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isFatalEnabled(Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#INFO INFO} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level INFO, {@code false} otherwise.
     */
    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#INFO INFO} Level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level INFO, {@code false} otherwise.
     */
    @Override
    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#TRACE TRACE} level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level TRACE, {@code false} otherwise.
     */
    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#TRACE TRACE} level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level TRACE, {@code false} otherwise.
     */
    @Override
    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#WARN WARN} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#WARN WARN}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    /**
     * Checks whether this Logger is enabled for the {@link Level#WARN WARN} Level.
     *
     * @param marker The Marker to check
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#WARN WARN}, {@code false}
     * otherwise.
     */
    @Override
    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void log(Level level, Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level     the logging level
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void log(Level level, Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the specified level with the specified
     * Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param level           the logging level
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void log(Level level, Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the specified level) with the specified Marker and
     * including the stack log of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier}
     * may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param level           the logging level
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void log(Level level, Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the given level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message CharSequence to log.
     */
    @Override
    public void log(Level level, Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param marker    the marker data specific to this log statement
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the given level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Marker marker, Object message) {

    }

    /**
     * Logs a message at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param marker    the marker data specific to this log statement
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the given level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the given level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void log(Level level, Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the specified level.
     *
     * @param level          the logging level
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param marker    the marker data specific to this log statement
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the specified level) with the specified Marker.
     *
     * @param level           the logging level
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void log(Level level, Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the specified level) with the specified Marker and
     * including the stack log of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param level           the logging level
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void log(Level level, Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level   the logging level
     * @param message the message string to be logged
     */
    @Override
    public void log(Level level, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the given level.
     *
     * @param level     the logging level
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void log(Level level, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the specified level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param level           the logging level
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void log(Level level, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the specified level) including the stack log of
     * the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may not use the
     * {@link MessageFactory} to construct the {@code Message}.
     *
     * @param level           the logging level
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack log.
     * @since 2.4
     */
    @Override
    public void log(Level level, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the given level.
     *
     * @param level   the logging level
     * @param message the message CharSequence to log.
     */
    @Override
    public void log(Level level, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the given level.
     *
     * @param level   the logging level
     * @param message the message object to log.
     */
    @Override
    public void log(Level level, Object message) {

    }

    /**
     * Logs a message at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the given level.
     *
     * @param level   the logging level
     * @param message the message string to log.
     */
    @Override
    public void log(Level level, String message) {

    }

    /**
     * Logs a message with parameters at the given level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void log(Level level, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the specified level.
     *
     * @param level          the logging level
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void log(Level level, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the given level including the stack trace of the {@link Throwable} <code>throwable</code> passed as
     * parameter.
     *
     * @param level     the logging level
     * @param message   the message to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void log(Level level, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the specified level.
     *
     * @param level           the logging level
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void log(Level level, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the specified level) including the stack log of
     * the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param level           the logging level
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack log.
     * @since 2.4
     */
    @Override
    public void log(Level level, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at the specified level.
     *
     * @param level   the logging level
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a formatted message using the specified format string and arguments.
     *
     * @param level  The logging Level.
     * @param marker the marker data specific to this log statement.
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    @Override
    public void printf(Level level, Marker marker, String format, Object... params) {

    }

    /**
     * Logs a formatted message using the specified format string and arguments.
     *
     * @param level  The logging Level.
     * @param format The format String.
     * @param params Arguments specified by the format.
     */
    @Override
    public void printf(Level level, String format, Object... params) {

    }

    /**
     * Logs a {@link Throwable} to be thrown. This may be coded as:
     *
     * <pre>
     * throw logger.throwing(Level.DEBUG, myException);
     * </pre>
     *
     * @param level     The logging Level.
     * @param throwable The Throwable.
     * @return the Throwable.
     */
    @Override
    public <T extends Throwable> T throwing(Level level, T throwable) {
        return null;
    }

    /**
     * Logs a {@link Throwable} to be thrown at the {@link Level#ERROR ERROR} level.
     * This may be coded as:
     *
     * <pre>
     * throw logger.throwing(myException);
     * </pre>
     *
     * @param throwable The Throwable.
     * @return the Throwable.
     */
    @Override
    public <T extends Throwable> T throwing(T throwable) {
        return null;
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void trace(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void trace(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#TRACE TRACE} level with
     * the specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void trace(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#TRACE TRACE} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void trace(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#TRACE TRACE} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message CharSequence to log.
     */
    @Override
    public void trace(Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void trace(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to log.
     */
    @Override
    public void trace(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void trace(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#TRACE
     * TRACE} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#TRACE TRACE} level with
     * the specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void trace(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#TRACE TRACE} level) with the
     * specified Marker and including the stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void trace(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void trace(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#TRACE TRACE} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void trace(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#TRACE TRACE} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void trace(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#TRACE TRACE} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void trace(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message CharSequence to log.
     */
    @Override
    public void trace(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void trace(Object message) {

    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void trace(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void trace(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#TRACE
     * TRACE} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void trace(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     * @see #debug(String)
     */
    @Override
    public void trace(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#TRACE TRACE} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void trace(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#TRACE TRACE} level) including the
     * stack trace of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack trace.
     * @since 2.4
     */
    @Override
    public void trace(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at trace level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs entry to a method. Used when the method in question has no parameters or when the parameters should not be
     * logged.
     *
     * @return built message
     * @since 2.6
     */
    @Override
    public EntryMessage traceEntry() {
        return null;
    }

    /**
     * Logs entry to a method along with its parameters. For example,
     *
     * <pre>
     * public void doSomething(String foo, int bar) {
     *     LOGGER.traceEntry("Parameters: {} and {}", foo, bar);
     *     // do something
     * }
     * </pre>
     * or:
     * <pre>
     * public int doSomething(String foo, int bar) {
     *     Message m = LOGGER.traceEntry("doSomething(foo={}, bar={})", foo, bar);
     *     // do something
     *     return traceExit(m, value);
     * }
     * </pre>
     *
     * @param format The format String for the parameters.
     * @param params The parameters to the method.
     * @return The built Message
     * @since 2.6
     */
    @Override
    public EntryMessage traceEntry(String format, Object... params) {
        return null;
    }

    /**
     * Logs entry to a method along with its parameters. For example,
     *
     * <pre>
     * public void doSomething(Request foo) {
     *     LOGGER.traceEntry(()->gson.toJson(foo));
     *     // do something
     * }
     * </pre>
     *
     * @param paramSuppliers The Suppliers for the parameters to the method.
     * @return built message
     * @since 2.6
     */
    @Override
    public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
        return null;
    }

    /**
     * Logs entry to a method along with its parameters. For example,
     *
     * <pre>
     * public void doSomething(String foo, int bar) {
     *     LOGGER.traceEntry("Parameters: {} and {}", ()->gson.toJson(foo), ()-> bar);
     *     // do something
     * }
     * </pre>
     *
     * @param format         The format String for the parameters.
     * @param paramSuppliers The Suppliers for the parameters to the method.
     * @return built message
     * @since 2.6
     */
    @Override
    public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
        return null;
    }

    /**
     * Logs entry to a method using a Message to describe the parameters.
     * <pre>
     * public void doSomething(Request foo) {
     *     LOGGER.traceEntry(new JsonMessage(foo));
     *     // do something
     * }
     * </pre>
     * <p>
     * Avoid passing a {@code ReusableMessage} to this method (therefore, also avoid passing messages created by
     * calling {@code logger.getMessageFactory().newMessage("some message")}): Log4j will replace such messages with
     * an immutable message to prevent situations where the reused message instance is modified by subsequent calls to
     * the logger before the returned {@code EntryMessage} is fully processed.
     * </p>
     *
     * @param message The message. Avoid specifying a ReusableMessage, use immutable messages instead.
     * @return the built message
     * @see ReusableMessage
     * @since 2.6
     */
    @Override
    public EntryMessage traceEntry(Message message) {
        return null;
    }

    /**
     * Logs exit from a method. Used for methods that do not return anything.
     *
     * @since 2.6
     */
    @Override
    public void traceExit() {

    }

    /**
     * Logs exiting from a method with the result. This may be coded as:
     *
     * <pre>
     * return LOGGER.traceExit(myResult);
     * </pre>
     *
     * @param result The result being returned from the method call.
     * @return the result.
     * @since 2.6
     */
    @Override
    public <R> R traceExit(R result) {
        return null;
    }

    /**
     * Logs exiting from a method with the result. This may be coded as:
     *
     * <pre>
     * return LOGGER.traceExit("Result: {}", myResult);
     * </pre>
     *
     * @param format The format String for the result.
     * @param result The result being returned from the method call.
     * @return the result.
     * @since 2.6
     */
    @Override
    public <R> R traceExit(String format, R result) {
        return null;
    }

    /**
     * Logs exiting from a method with no result. Allows custom formatting of the result. This may be coded as:
     *
     * <pre>
     * public long doSomething(int a, int b) {
     *    EntryMessage m = traceEntry("doSomething(a={}, b={})", a, b);
     *    // ...
     *    return LOGGER.traceExit(m);
     * }
     * </pre>
     *
     * @param message The Message containing the formatted result.
     * @since 2.6
     */
    @Override
    public void traceExit(EntryMessage message) {

    }

    /**
     * Logs exiting from a method with the result. Allows custom formatting of the result. This may be coded as:
     *
     * <pre>
     * public long doSomething(int a, int b) {
     *    EntryMessage m = traceEntry("doSomething(a={}, b={})", a, b);
     *    // ...
     *    return LOGGER.traceExit(m, myResult);
     * }
     * </pre>
     *
     * @param message The Message containing the formatted result.
     * @param result  The result being returned from the method call.
     * @return the result.
     * @since 2.6
     */
    @Override
    public <R> R traceExit(EntryMessage message, R result) {
        return null;
    }

    /**
     * Logs exiting from a method with the result. Allows custom formatting of the result. This may be coded as:
     *
     * <pre>
     * return LOGGER.traceExit(new JsonMessage(myResult), myResult);
     * </pre>
     *
     * @param message The Message containing the formatted result.
     * @param result  The result being returned from the method call.
     * @return the result.
     * @since 2.6
     */
    @Override
    public <R> R traceExit(Message message, R result) {
        return null;
    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message string to be logged
     */
    @Override
    public void warn(Marker marker, Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN} level.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void warn(Marker marker, Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#WARN WARN} level with the
     * specified Marker. The {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the
     * {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void warn(Marker marker, MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#WARN WARN} level) with the
     * specified Marker and including the stack warn of the {@link Throwable} <code>throwable</code> passed as parameter. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void warn(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#WARN WARN} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message CharSequence to log.
     */
    @Override
    public void warn(Marker marker, CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(Marker marker, CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void warn(Marker marker, Object message) {

    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(Marker marker, Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message object to log.
     */
    @Override
    public void warn(Marker marker, String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#WARN WARN} level.
     *
     * @param marker  the marker data specific to this log statement.
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void warn(Marker marker, String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#WARN
     * WARN} level.
     *
     * @param marker         the marker data specific to this log statement
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param marker    the marker data specific to this log statement
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(Marker marker, String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#WARN WARN} level with the
     * specified Marker.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void warn(Marker marker, Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#WARN WARN} level) with the
     * specified Marker and including the stack warn of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param marker          the marker data specific to this log statement
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       A Throwable or null.
     * @since 2.4
     */
    @Override
    public void warn(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN} level.
     *
     * @param message the message string to be logged
     */
    @Override
    public void warn(Message message) {

    }

    /**
     * Logs a message with the specific Marker at the {@link Level#WARN WARN} level.
     *
     * @param message   the message string to be logged
     * @param throwable A Throwable or null.
     */
    @Override
    public void warn(Message message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#WARN WARN} level. The
     * {@code MessageSupplier} may or may not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @since 2.4
     */
    @Override
    public void warn(MessageSupplier messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#WARN WARN} level) including the
     * stack warn of the {@link Throwable} <code>throwable</code> passed as parameter. The {@code MessageSupplier} may or may
     * not use the {@link MessageFactory} to construct the {@code Message}.
     *
     * @param messageSupplier A function, which when called, produces the desired log message.
     * @param throwable       the {@code Throwable} to log, including its stack warn.
     * @since 2.4
     */
    @Override
    public void warn(MessageSupplier messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message CharSequence with the {@link Level#WARN WARN} level.
     *
     * @param message the message CharSequence to log.
     */
    @Override
    public void warn(CharSequence message) {

    }

    /**
     * Logs a CharSequence at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message CharSequence to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(CharSequence message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message object to log.
     */
    @Override
    public void warn(Object message) {

    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(Object message, Throwable throwable) {

    }

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message string to log.
     */
    @Override
    public void warn(String message) {

    }

    /**
     * Logs a message with parameters at the {@link Level#WARN WARN} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params  parameters to the message.
     * @see #getMessageFactory()
     */
    @Override
    public void warn(String message, Object... params) {

    }

    /**
     * Logs a message with parameters which are only to be constructed if the logging level is the {@link Level#WARN
     * WARN} level.
     *
     * @param message        the message to log; the format depends on the message factory.
     * @param paramSuppliers An array of functions, which when called, produce the desired log message parameters.
     * @since 2.4
     */
    @Override
    public void warn(String message, Supplier<?>... paramSuppliers) {

    }

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>throwable</code> passed as parameter.
     *
     * @param message   the message object to log.
     * @param throwable the {@code Throwable} to log, including its stack trace.
     */
    @Override
    public void warn(String message, Throwable throwable) {

    }

    /**
     * Logs a message which is only to be constructed if the logging level is the {@link Level#WARN WARN} level.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @since 2.4
     */
    @Override
    public void warn(Supplier<?> messageSupplier) {

    }

    /**
     * Logs a message (only to be constructed if the logging level is the {@link Level#WARN WARN} level) including the
     * stack warn of the {@link Throwable} <code>throwable</code> passed as parameter.
     *
     * @param messageSupplier A function, which when called, produces the desired log message; the format depends on the
     *                        message factory.
     * @param throwable       the {@code Throwable} to log, including its stack warn.
     * @since 2.4
     */
    @Override
    public void warn(Supplier<?> messageSupplier, Throwable throwable) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param marker  the marker data specific to this log statement
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8) {

    }

    /**
     * Logs a message with parameters at warn level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param p0      parameter to the message.
     * @param p1      parameter to the message.
     * @param p2      parameter to the message.
     * @param p3      parameter to the message.
     * @param p4      parameter to the message.
     * @param p5      parameter to the message.
     * @param p6      parameter to the message.
     * @param p7      parameter to the message.
     * @param p8      parameter to the message.
     * @param p9      parameter to the message.
     */
    @Override
    public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) {

    }
}
