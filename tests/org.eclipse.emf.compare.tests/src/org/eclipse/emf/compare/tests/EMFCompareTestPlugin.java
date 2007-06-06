package org.eclipse.emf.compare.tests;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Cedric Brun <a href="mailto:cedric.brun@obeo.fr">cedric.brun@obeo.fr</a>
 */
public class EMFCompareTestPlugin extends AbstractUIPlugin {
	/** The plug-in ID. */
	public static final String PLUGIN_ID = "org.eclipse.emf.compare.tests"; //$NON-NLS-1$

	// The shared instance
	private static EMFCompareTestPlugin plugin;

	/**
	 * Default constructor for the plugin.
	 */
	public EMFCompareTestPlugin() {
		plugin = this;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(final BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static EMFCompareTestPlugin getDefault() {
		return plugin;
	}

}