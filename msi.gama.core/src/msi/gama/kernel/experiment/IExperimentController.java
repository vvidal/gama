/**
 * Created by drogoul, 6 déc. 2015
 *
 */
package msi.gama.kernel.experiment;

import msi.gama.runtime.FrontEndScheduler;

/**
 * Class IExperimentController.
 *
 * @author drogoul
 * @since 6 déc. 2015
 *
 */
public interface IExperimentController {

	int _OPEN = 0;
	int _START = 1;
	int _STEP = 2;
	int _PAUSE = 3;
	int _STOP = 4;
	int _CLOSE = 5;
	int _RELOAD = 6;
	int _NEXT = 7;

	/**
	 * @return
	 */
	IExperimentPlan getExperiment();

	/**
	 * @return
	 */
	FrontEndScheduler getScheduler();

	/**
	 *
	 */
	void userStep();

	/**
	 *
	 */
	void startPause();

	/**
	 *
	 */
	void close();

	/**
	 *
	 */
	void userStart();

	/**
	 *
	 */
	void directPause();

	/**
	 *
	 */
	void dispose();

	/**
	 *
	 */
	void directOpenExperiment();

	/**
	 *
	 */
	void userReload();

	/**
	 *
	 */
	void userInterrupt();

	/**
	 *
	 */
	void userPause();

	/**
	 *
	 */
	void userOpen();

}