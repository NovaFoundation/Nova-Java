package nova.java.nodewriters;

import net.fathomsoft.nova.tree.match.Default;

public abstract class DefaultWriter extends MatchCaseWriter
{
	public abstract Default node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		if (node().getParentMatch().isConventionalSwitch())
		{
			builder.append("default:\n");
			
			getWriter(node().getScope()).write(builder, false);
		}
		else
		{
			builder.append("else\n");
			
			getWriter(node().getScope()).write(builder);
		}
		
		return builder;
	}
}