package SmockeTest;

public @interface QmetryTestCase {
	/**

	 * Test case id to be mapped with QMetry test case.

	 * 

	 * @return

	 */

	/**

	 * map with QMetry test case id. separate with comma if more than one test

	 * case id to map

	 */

	String TC_ID() default "";



	/**

	 * @return

	 */

	String build() default "";



	String project() default "";



	String release() default "";



	/**

	 * map with QMetry test case run id. separate with comma if more than one

	 * run id to map

	 * 

	 * @return

	 */

	String runId() default "";



	String testScriptName() default "";



	/**

	 * mark for not to map with QMetry

	 * 

	 * @return

	 */

	boolean skip() default false;
}
