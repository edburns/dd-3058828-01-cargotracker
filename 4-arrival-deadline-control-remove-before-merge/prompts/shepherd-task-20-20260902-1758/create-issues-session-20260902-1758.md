# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `d6d764fd-2c03-4eac-b219-a23eab0abfb6`  
> - **Started:** 9/2/2026, 5:58:48 PM  
> - **Duration:** 3m 54s  
> - **Exported:** 9/2/2026, 6:02:42 PM  

---

<sub>7s</sub>

### User

Invoke skill `shepherd-task-20-create-issues-from-plan` with these inputs:

- CAMPAIGN_ID: 48f8a98a-83f9-466b-aa2e-14edbb4449e9
- LESSON_PROPAGATION: off
- REPO: edburns/dd-3058828-01-cargotracker
- BASE_BRANCH: experiment/shepherd-control
- PARENT_ISSUE: 4
- PLAN_DIRECTORY: 4-arrival-deadline-control-remove-before-merge
- PLAN_FILE_NAME: add-change-arrival-deadline-feature-ignorance-reduction-plan.md
- QUESTIONS_SECTION: ## Phase 3 — Ignorance reduction: questions to answer before writing code
- IMPLEMENTATION_SECTION: ## Phase 4 — Implementation (five serial issues)
- EXPECTED_TASK_COUNT: 5
- BASE_REMOTE: origin
- LOG_DIRECTORY: C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758
- DRAFT_VALIDATOR: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1
- ISSUE_BODY_VERIFIER: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1



---

<sub>10s</sub>

### `skill`

**shepherd-task-20-create-issues-from-plan**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "shepherd-task-20-create-issues-from-plan"
}
```

</details>

```
Skill "shepherd-task-20-create-issues-from-plan" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>17s</sub>

### Copilot

I’m validating the campaign inputs, plan structure, repository state, and drafting conventions before any GitHub mutation.

---

<sub>27s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md

<details>
<summary>15 lines</summary>

```
# Example 01: 1682-java-tool-ergonomics-prompts-remove-before-merge

Read `copilot-sdk/1682-java-tool-ergonomics-prompts-remove-before-merge/dd-3018003-ignorance-reduction-for-implementation-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 3 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating issues of type **Task** as children of Epic https://github.com/github/copilot-sdk/issues/1682 . These issues correspond to the sub-sections in `## Phase 4 — Implementation (the build order)`.

I want you to use `gh` to create issues as sub-issues of 1682.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Set the type to **Task**.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `upstream`: `edburns/1682-java-tool-ergonomics`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `1682-java-tool-ergonomics-prompts-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>28s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md

<details>
<summary>12 lines</summary>

```
# Example 02: 1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge

Carefully read the plan `copilot-sdk/1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`.

We have completed Phases 1 - 3. We are now on Phase 4.

For each sub item in Phase 4, file a child issue of Feature #1810.

Use `gh` to look at Epic #1682 and its child issues for the standard of verbosity and concreteness for issue descriptions.

The issue should be assignable to a coding agent and there must be sufficient detail in the description for the agent to proceed to completion.

Pull out the specific relevant content from Phase 3 as it applies to this current issue in Phase 4.

Tell the agent to take `edburns/1810-java-tool-ergonomics-tool-as-lambda` as the base branch. When I assign the issue to the coding agent, I will set this as the base branch.

Tell the agent to read `1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`, which is present on the branch, for context.

Tell the agent which sub-item within Phase 4 they are solving.

Tell the agent that each issue will be assigned, resolved and merged to the base branch in the order in which they appear in the plan.

No work is to start until I assign each issue to the coding agent, in turn.
```

</details>


---

<sub>27s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md

<details>
<summary>14 lines</summary>

```
# Example 03: dd-3017826-java-real-estate-demo-remove-before-merge

Read `dd-3017826-java-real-estate-demo-remove-before-merge\dd-3017826-java-real-estate-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/2 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #2.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/2-build-out-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `dd-3017826-java-real-estate-demo-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>28s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md

<details>
<summary>16 lines</summary>

```
# Example 04: 28-python-agent-demo-remove-before-merge

Read `28-python-agent-demo-remove-before-merge/28-python-agent-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`. These pertain to the implementation tasks in Phase 3. ✅✅✅ Make sure to put into the description explicit instructions on how to access the relevant spike research.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/28 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #28

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Again, ✅✅For each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`, include the relevant Resolution values in the issue description. These pertain to the implementation tasks in Phase 3. ✅✅✅ Make sure to put into the description explicit instructions on how to access the relevant spike research for that task.

- For tasks dealing with the UI, make sure to refer to the relevant screengrabs, but only ones within `28-python-agent-demo-remove-before-merge/`.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/28-python-agent-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `28-python-agent-demo-remove-before-merge/`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>26s</sub>

### `glob`

**4-arrival-deadline-control-remove-before-merge/**/***

"4-arrival-deadline-control-remove-before-merge/**/*"

<details>
<summary>7 matches</summary>

```
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\shepherd-test-experiment.json
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\shepherd-campaign.json
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\campaign-lessons.md
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\20260902-1758-invoke-shepherd-task-20-create-issues-from-plan-skill.ps1
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\create-issues-otel-20260902-1758.jsonl
C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\20260902-1758-invoke-shepherd-task-20-create-issues-from-plan-skill.md
```

</details>


---

<sub>26s</sub>

### `sql`

**Track stage twenty work**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Track stage twenty work",
  "query": "INSERT INTO todos (id, title, description, status) VALUES ('validate-stage20', 'Validating stage 20 inputs', 'Validate repository, branch, parent issue, campaign metadata, plan headings, resolution blocks, scripts, log directory, issue type, and existing children.', 'in_progress'), ('draft-stage20', 'Drafting implementation issues', 'Build traceability map and persist five complete issue bodies in plan order, enforcing the spike firewall and lesson propagation off.', 'pending'), ('create-stage20', 'Creating ordered child issues', 'Validate drafts, initialize ledger and result, create, verify, and link each child issue serially.', 'pending'), ('verify-stage20', 'Verifying stage 20 postconditions', 'Verify child ordering, bodies, state, assignees, issue type behavior, and write complete result.', 'pending')"
}
```

</details>

```
4 row(s) inserted. Last inserted row ID: 4.
```


---

<sub>44s</sub>

### `powershell`

**Validate local stage inputs**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758'; $bodyDir=Join-Path $logDir 'issue-bodies'; if (-not [System.IO.Path]::IsPathRooted($logDir)) { throw 'LOG_DIRECTORY is not absolute' }; if (-not (Test-Path -LiteralPath $logDir -PathType Container)) { throw 'LOG_DIRECTORY does not exist' }; New-Item -ItemType Directory -Force -Path $bodyDir | Out-Null; $probe=Join-Path $logDir '.write-probe'; [System.IO.File]::WriteAllText($probe,'ok'); Remove-Item -LiteralPath $probe; foreach($script in @('C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1','C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1')) { if (-not [System.IO.Path]::IsPathRooted($script) -or -not (Test-Path -LiteralPath $script -PathType Leaf)) { throw \"Invalid script: $script\" } }; git remote -v; git branch --list 'experiment/shepherd-control'; git ls-remote --heads origin 'experiment/shepherd-control'; git remote get-url origin; git --no-pager status --short",
  "description": "Validate local stage inputs",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>7 lines</summary>

```
origin	https://github.com/edburns/dd-3058828-01-cargotracker.git (fetch)
origin	https://github.com/edburns/dd-3058828-01-cargotracker.git (push)
* experiment/shepherd-control
df9892e8c778aac61c10ae3897c8de73afac647c	refs/heads/experiment/shepherd-control
https://github.com/edburns/dd-3058828-01-cargotracker.git
?? 4-arrival-deadline-control-remove-before-merge/prompts/
<shellId: 2 completed with exit code 0>
```

</details>


---

<sub>43s</sub>

### `powershell`

**Read plan from base branch**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; git show 'experiment/shepherd-control:4-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'",
  "description": "Read plan from base branch",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>11 lines</summary>

```
Output too large to read at once (33.6 KB). Saved to: C:\Users\edburns\AppData\Local\Temp\1788397169493-copilot-tool-output-17220-1d7d12e7-0936-49cd-93fc-39d310758326.txt
Consider using tools like rg (for searching), head/tail (for viewing start/end), view with view_range (for specific sections), or jq (for JSON) to examine portions of the output.

Preview (first 500 chars):
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns  
Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)  
Working directory: `/home/edburns/workareas/cargotracker-01/`  
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0  
Baseline run instructions: `README.md`  
Baseline preparation prompt: `dd-3058828-cargotracker-remove-before-merge/20260902-make-e7
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>43s</sub>

### `powershell`

**Read campaign metadata**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; git show 'experiment/shepherd-control:4-arrival-deadline-control-remove-before-merge/shepherd-campaign.json'; git cat-file -e 'experiment/shepherd-control:4-arrival-deadline-control-remove-before-merge/campaign-lessons.md'; if ($LASTEXITCODE -ne 0) { throw 'campaign-lessons.md missing' }; Write-Output 'campaign-lessons.md exists'",
  "description": "Read campaign metadata",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>14 lines</summary>

```
{
  "schemaVersion": 1,
  "campaignId": "48f8a98a-83f9-466b-aa2e-14edbb4449e9",
  "campaignIssueNumber": 4,
  "campaignShortname": "arrival-deadline-control",
  "repository": "edburns/dd-3058828-01-cargotracker",
  "baseBranch": "experiment/shepherd-control",
  "lessonPropagation": "off",
  "campaignMetadataDirectory": "4-arrival-deadline-control-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdAt": "2026-09-03T00:54:22Z"
}
campaign-lessons.md exists
<shellId: 1 completed with exit code 0>
```

</details>


---

<sub>44s</sub>

### `powershell`

**Inspect repository and parent**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; gh api 'repos/edburns/dd-3058828-01-cargotracker' --jq '{default_branch:.default_branch,owner_login:.owner.login,owner_type:.owner.type}'; gh api 'repos/edburns/dd-3058828-01-cargotracker/issues/4' --jq '{number:.number,state:.state,repository_url:.repository_url,title:.title}'; gh api 'repos/edburns/dd-3058828-01-cargotracker/issues/4/sub_issues' --paginate --jq '.[] | {id,number,title,html_url}'",
  "description": "Inspect repository and parent",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

```
{"default_branch":"20260902-2104Z-commit-e7b651f-liberty","owner_login":"edburns","owner_type":"User"}
{"number":4,"repository_url":"https://api.github.com/repos/edburns/dd-3058828-01-cargotracker","state":"open","title":"[Campaign][off] Cargo Tracker arrival-deadline experiment"}
<shellId: 3 completed with exit code 0>
```


---

<sub>49s</sub>

### `view`

**view the file at C:\Users\edburns\AppData\Local\Temp\1788397169493-copilot-tool-output-17220-1d7d12e7-0936-49cd-93fc-39d310758326.txt.**

C:\Users\edburns\AppData\Local\Temp\1788397169493-copilot-tool-output-17220-1d7d12e7-0936-49cd-93fc-39d310758326.txt

<details>
<summary>679 lines</summary>

````
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns  
Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)  
Working directory: `/home/edburns/workareas/cargotracker-01/`  
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0  
Baseline run instructions: `README.md`  
Baseline preparation prompt: `dd-3058828-cargotracker-remove-before-merge/20260902-make-e7b651f-run-with-production-baseline.md`  
Historical issue: `eclipse-ee4j/cargotracker#64`  

Related directories and files:

- `src/main/java/org/eclipse/cargotracker/application/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
- `src/main/webapp/admin/dialogs/`
- `src/main/webapp/admin/tables/listNotRouted.xhtml`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

---

## Goal

Add an Administration dashboard operation that lets a shipping administrator
change the arrival deadline of a cargo listed in the **Not Routed Cargo** table.
The operation must preserve Cargo Tracker's layered architecture:

1. The application service owns the domain mutation.
2. The booking facade shields the web layer from domain types.
3. A JSF backing bean loads and submits the editable date.
4. A PrimeFaces dynamic dialog presents the editor.
5. The existing Not Routed Cargo table opens the dialog and refreshes after a
   successful update.

### User-visible acceptance behavior

Using the stable sample cargo `DEF789`:

1. Start the application with Java 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Open `http://localhost:8080/cargo-tracker/`.
3. Select **Administration**.
4. Find `DEF789` in the **Not Routed Cargo** table.
5. The Deadline cell displays its date together with an edit icon.
6. Hovering over the deadline displays:
   `Click to change cargo arrival deadline date.`
7. Selecting the deadline opens a modal dialog titled **Change Deadline**.
8. The dialog displays the cargo's origin and destination as read-only
   context.
9. The date editor is initialized to the cargo's current arrival deadline.
10. Selecting a different date and pressing **Update** closes the dialog and
    refreshes the Administration view.
11. The new date is shown in the Not Routed Cargo table.
12. Reloading the page continues to show the new date for the lifetime of the
    running in-memory sample application.
13. Pressing **Cancel** closes the dialog without changing the deadline.

### Domain acceptance behavior

Changing the deadline must:

- locate the cargo by `TrackingId`;
- preserve its existing origin;
- preserve its existing destination;
- replace only the arrival deadline in its `RouteSpecification`;
- apply the specification through `Cargo.specifyNewRoute(...)`;
- preserve the currently assigned itinerary rather than silently discarding
  it;
- allow the domain model to recalculate routing status and delivery-derived
  values against the new route specification;
- persist the changed cargo through `CargoRepository.store(...)`.

### Hard scope constraints

- Begin from commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d`.
- Preserve Java EE 7 and the `javax.*` namespace.
- Preserve the Java 7 source/target level used by this historical codebase.
- Run the application on JDK 17 using the existing Open Liberty profile.
- Do not migrate the application to Jakarta EE 8+, Jakarta EE 9+, Spring, or a
  different UI framework.
- Do not replace the in-memory Derby configuration or the Open Liberty runtime.
- Do not redesign unrelated cargo booking, routing, destination editing,
  messaging, batch, REST, or persistence behavior.
- Do not copy commits or files from feature-bearing branches. This plan is the
  implementation specification.
- Implement the five build issues below in order. Each issue must be complete
  and gated before the next issue begins.

---

## Completed phases

### Phase 1 ✅ — Establish a runnable feature-absent baseline

- Commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d` is based on the historical
  feature-absent commit and contains only the compatibility work needed to run
  the sample on JDK 17 and Open Liberty.
- `./mvnw clean package -Popenliberty liberty:run` starts the application.
- The home page and Administration flows return HTTP 200.
- JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
- The internal routing REST client works without a Jersey/MOXy classloading
  conflict.
- The scheduled batch job has the local authorization it needs.

### Phase 2 ✅ — Verify the before and after user experience

- Before implementation, `DEF789` appears in the Not Routed Cargo table with a
  plain-text deadline and no edit operation.
- The neighboring Destination column demonstrates the existing PrimeFaces
  dynamic-dialog interaction pattern.
- The desired after behavior has been manually exercised: open the deadline
  editor, choose a new date, update, refresh the table, and observe the
  persisted value.
- The historical architectural boundaries and affected files have been
  identified.

---

## Phase 3 — Ignorance reduction: questions to answer before writing code

Resolve these questions before production implementation begins. The
recommendations intentionally define the desired design closely enough that an
implementing agent should not need to invent a different architecture.

### 3.1 — Which cargos expose the edit operation?

**Question:** Should deadline editing be exposed for all cargos or only for
cargos displayed in the Not Routed Cargo table?

The requested feature originates in the Administration dashboard's Not Routed
Cargo table. Other tables represent routed, misrouted, claimed, or otherwise
progressed cargo. Adding the affordance to every table would expand the feature
and require additional business rules about changing deadlines after handling
has begun.

| Option | UI scope | Trade-off |
|--------|----------|-----------|
| A | Not Routed Cargo table only | Matches the requested feature and the established destination-edit affordance. |
| B | Every Administration cargo table | Broader capability, but introduces lifecycle and authorization questions outside the request. |
| C | Cargo details page only | Avoids table complexity but does not meet the requested dashboard interaction. |

The application-service operation itself does not need to encode a UI-table
restriction. It should accept a tracking ID and apply the domain mutation to
the located cargo. The presentation layer determines where the operation is
offered.

**Recommendation:** Option A. Add the edit affordance only to
`src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
operation generally usable for a valid cargo.

**Resolution:**

Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);
        
cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory, given that the
historical JUnit/Arquillian suite is configured for a remote Payara 4
container, while the prepared production baseline runs on JDK 17/Open Liberty?

The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
builds and compiles all test sources but does not provide a Liberty Arquillian
adapter. Modernizing the entire integration-test runtime is outside this
feature's scope.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Ensure all test sources compile as part of
   `./mvnw clean package -Popenliberty`.
3. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
4. Perform mandatory end-to-end verification against the running Open Liberty
   application.
5. Preserve the existing Payara Arquillian test path; do not delete, disable,
   or rewrite it to manufacture a passing result.

**Spike needed:** Before Issue 1 implementation, run the starting commit's
standard Open Liberty package command and record whether tests are compiled but
skipped. Confirm the new `BookingServiceTest` method can be added without
expanding the runtime modernization scope.

**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
as the mandatory executable gate. Keep the historical Arquillian test as a
precise application-layer specification and run it only when its documented
Payara environment is available.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
4. Apply it using `cargo.specifyNewRoute(routeSpecification)`.
5. Persist using `cargoRepository.store(cargo)`.
6. Log the tracking ID and new deadline at `Level.INFO`, following the style of
   `changeDestination(...)`.

Do not:

- add a setter to `Cargo` or `RouteSpecification`;
- modify the origin or destination;
- clear or replace the itinerary directly;
- update persistence entities behind the aggregate's back.

**Tests to write first**

Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
`testChangeDestination()`. Build a new deadline one month after the test's
original `deadline`, invoke the service, reload the cargo with
`Cargo.findByTrackingId`, and assert:

- origin remains Chicago;
- destination remains Helsinki;
- stored deadline is the same calendar day as the requested new deadline;
- assigned itinerary remains unchanged;
- transport status remains `NOT_RECEIVED`;
- last known location remains `Location.UNKNOWN`;
- current voyage remains `Voyage.NONE`;
- cargo is not marked misdirected;
- estimated time of arrival is `Delivery.ETA_UNKOWN`;
- next expected activity is `Delivery.NO_ACTIVITY`;
- cargo is not unloaded at destination;
- routing status reflects the domain model's recalculation and remains
  `MISROUTED` for the established test sequence.

**Gating criteria**

- The test source compiles.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- No web, facade, REST, Liberty, or persistence configuration files change in
  this issue.

### 4.2 — Issue 2: Expose deadline changes through the booking facade

**What to build**

Expose the use case to presentation clients without leaking domain identifier
types into the web layer.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`

**Optional focused test file**

- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`

**Required API**

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

**Required implementation**

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

The facade must not:

- load and mutate `Cargo` itself;
- call `CargoRepository.store(...)`;
- parse a formatted date;
- introduce JSF or PrimeFaces types.

**Tests**

Where a container-free test is added, use a hand-written `BookingService` fake
or spy and prove that:

- the same `Date` object/value reaches the application service;
- the tracking-ID string is converted to an equivalent `TrackingId`;
- the facade delegates exactly once;
- no repository work is duplicated in the facade.

Do not add Mockito or another dependency solely for this test.

**Gating criteria**

- Existing facade consumers still compile.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- The application-layer test added in Issue 1 remains unchanged and compiling.

### 4.3 — Issue 3: Implement the deadline editor backing model

**What to build**

Add the view-scoped backing bean that loads a cargo's current deadline and
submits a replacement deadline through the booking facade. Do not add the
dialog launcher or XHTML in this issue.

**File to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`

**Required bean shape**

```java
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;
}
```

Required properties and methods:

- `getTrackingId()` / `setTrackingId(String)`
- `getCargo()`
- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`
- `load()`
- `changeArrivalDeadline()`

**Load behavior**

1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.
2. Store the returned `CargoRoute`.
3. Parse `cargo.getArrivalDeadlineDate()` using `MM/dd/yyyy`.
4. Store the resulting `Date` in `arrivalDeadlineDate`.
5. Do not query a repository or domain object directly.
6. Do not ignore a parsing failure or merely print its stack trace. Surface a
   clear application/view error consistent with existing JSF behavior.

**Submit behavior**

1. Refuse a null date through JSF validation or explicit bean validation.
2. Call
   `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.
3. Close the dynamic dialog with:

   ```java
   PrimeFaces.current().dialog().closeDynamic("DONE");
   ```

4. Do not close the dialog if the facade call fails.

**Tests to write**

Add a container-free JUnit test if practical, using a hand-written fake facade,
that proves:

- `load()` requests the correct tracking ID;
- `load()` converts an `MM/dd/yyyy` DTO date into the editable `Date`;
- `changeArrivalDeadline()` delegates the selected date and tracking ID;
- a malformed DTO deadline is surfaced rather than converted to null;
- a null selected date is rejected.

Do not add a mocking framework solely for these tests.

**Gating criteria**

- The bean is serializable and uses the established CDI/JSF annotations.
- The bean references only facade DTOs, not domain model classes.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.

### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog

**What to build**

Add the session-scoped dialog launcher and the dynamic dialog view. The dialog
must work when addressed directly with a `trackingId` query parameter, but it
is not yet linked from the dashboard in this issue.

**Files to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`

**Launcher requirements**

Use:

```java
@ManagedBean(name = "changeArrivalDeadlineDateDialog")
@SessionScoped
```

Implement:

- `showDialog(String trackingId)`
- `handleReturn(SelectEvent event)`
- `cancel()`

`showDialog(...)` must:

- set the options documented in Question 3.7;
- pass `trackingId` as a dynamic-dialog request parameter;
- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`.

`cancel()` must close the dialog without invoking the facade.

**XHTML requirements**

The page title must be:

```xhtml
<title>Change Deadline</title>
```

Place metadata directly beneath the root `<html>` element and before
`<h:head>`:

```xhtml
<f:metadata>
    <f:viewParam name="trackingId"
                 value="#{changeArrivalDeadlineDate.trackingId}"/>
    <f:viewAction action="#{changeArrivalDeadlineDate.load}"/>
</f:metadata>
```

The form must display:

- `Origin:` and `changeArrivalDeadlineDate.cargo.originName`;
- `Destination:` and
  `changeArrivalDeadlineDate.cargo.finalDestinationName`;
- `Deadline:` and a `p:datePicker` bound to
  `changeArrivalDeadlineDate.arrivalDeadlineDate`;
- **Cancel**, invoking
  `changeArrivalDeadlineDateDialog.cancel()`;
- **Update**, invoking
  `changeArrivalDeadlineDate.changeArrivalDeadline()`.

The date picker must require a value. The Update action must reload or refresh
the calling Administration view after a successful dialog close, following the
existing destination-dialog behavior.

**Runtime tests**

With the application running, request:

```text
http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789
```

Verify:

- HTTP 200;
- title is **Change Deadline**;
- origin and destination render;
- the existing deadline is selected;
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRouted.arrivalDeadlineDate`;
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Confirm the home page returns HTTP 200.
3. Open Administration and locate `DEF789`.
4. Record the original deadline.
5. Confirm the deadline now has an edit icon and tooltip.
6. Open the deadline dialog.
7. Confirm origin and destination identify the same cargo.
8. Choose a visibly different date.
9. Press **Update**.
10. Confirm the dialog closes and the Not Routed Cargo table refreshes.
11. Confirm the table shows the selected date.
12. Reload the browser and confirm the selected date remains.
13. Reopen the dialog and confirm the editor initializes to the changed date.
14. Press **Cancel** and confirm no additional change occurs.
15. Verify the Destination edit dialog still opens.
16. Verify selecting `DEF789` for routing still loads without an error page.

**Log acceptance**

The final run must contain none of:

- `<f:metadata> Parent UIComponent`;
- `TagException`;
- `VerifyError`;
- `FacesException`;
- `CWWKZ0002E` or `CWWKZ0003E`;
- recurring batch authorization failures;
- new FFDC files attributable to this feature.

Transient JMS activation-order warnings are acceptable only if all message
endpoints subsequently activate, as established by the prepared baseline.

**Final regression and scope checks**

- `./mvnw clean package -Popenliberty` succeeds.
- The existing test sources and the new deadline test compile.
- No Java EE namespace migration occurred.
- No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
  compatibility fix from the starting commit was reverted.
- The feature affects only the intended application, facade, web, dialog,
  table, and test surfaces.
- Stop Liberty cleanly.

---

## Phase 5 — Documentation and implementation handoff

- Update `README.md` only if user-facing Administration capabilities are
  enumerated there; add one concise sentence that administrators can change an
  unrouted cargo's arrival deadline.
- Record the exact JDK 17 run command in the final issue or pull-request
  description:

  ```bash
  ./mvnw clean package -Popenliberty liberty:run
  ```

- Include `DEF789` and the before/after deadline values in the acceptance
  evidence.
- State explicitly that data is in-memory and resets when the application is
  rebuilt/restarted.

---

## Cross-cutting concerns

| Concern | Required treatment |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
| Date handling | Use `java.util.Date` at service/facade boundaries and `MM/dd/yyyy` for the date-only editor representation. |
| Time zones | Acceptance compares the calendar date displayed by the application; do not introduce a new timezone policy in this feature. |
| Error handling | Do not silently swallow parse, lookup, validation, or persistence failures. A failed update must not look successful. |
| JSF compatibility | Keep `<f:metadata>` at view-root scope for MyFaces. |
| Bean lifecycle | Editor is CDI `@ViewScoped`; dynamic-dialog launcher mirrors the existing session-scoped JSF managed bean. |
| Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
| Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
| Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
| Experiment integrity | Implement from this specification starting at `9b9f311b2a3a2854bdac947593950d9edb6bca7d`; do not cherry-pick or inspect feature-bearing commits. |
````

</details>


---

<sub>1m 2s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1

<details>
<summary>59 lines</summary>

```
<#
.SYNOPSIS
    Validates persisted stage-20 issue bodies before GitHub mutation.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [string]$BodyDirectory,

    [Parameter(Mandatory)]
    [ValidateRange(1, [int]::MaxValue)]
    [int]$ExpectedCount,

    [Parameter(Mandatory)]
    [ValidateSet('off', 'campaign')]
    [string]$LessonPropagation
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

if (-not (Test-Path -LiteralPath $BodyDirectory -PathType Container)) {
    throw "Stage-20 body directory does not exist: $BodyDirectory"
}

$bodyFiles = @(
    Get-ChildItem -LiteralPath $BodyDirectory -Filter '*-body.md' -File |
        Where-Object { $_.Name -notlike '*-observed-body.md' } |
        Sort-Object Name
)
if ($bodyFiles.Count -ne $ExpectedCount) {
    throw "Expected $ExpectedCount persisted stage-20 body files; found $($bodyFiles.Count)."
}

$requiredHeadings = @(
    '## Campaign context and required reading',
    '## Branch and execution order',
    '## Implement',
    '## Completion gates',
    '## Out of scope'
)

foreach ($bodyFile in $bodyFiles) {
    $text = [System.IO.File]::ReadAllText($bodyFile.FullName)
    $lines = [System.IO.File]::ReadAllLines($bodyFile.FullName)
    if ([string]::IsNullOrWhiteSpace($text) -or $text -notmatch "`r?`n" -or $lines.Count -le 1) {
        throw "Persisted issue body must contain physical Markdown lines: $($bodyFile.FullName)"
    }

    $firstNonblank = $lines | Where-Object { -not [string]::IsNullOrWhiteSpace($_) } | Select-Object -First 1
    if ($firstNonblank -notmatch '^##\s+\S') {
        throw "Persisted issue body must begin with a level-two heading: $($bodyFile.FullName)"
    }

    foreach ($heading in $requiredHeadings) {
        if ($lines -cnotcontains $heading) {
            throw "Persisted issue body is missing the physical heading '$heading': $($bodyFile.FullName)"
        }
    }

    $hasCampaignLessons = $lines -ccontains '## Campaign lessons (REQUIRED)'
    if ($LessonPropagation -eq 'campaign' -and -not $hasCampaignLessons) {
        throw "Treatment issue body is missing its campaign-lessons heading: $($bodyFile.FullName)"
    }
    if ($LessonPropagation -eq 'off' -and $hasCampaignLessons) {
        throw "Control issue body unexpectedly contains a campaign-lessons heading: $($bodyFile.FullName)"
    }
}

$bodyFiles
```

</details>


---

<sub>1m 3s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1

<details>
<summary>165 lines</summary>

```
<#
.SYNOPSIS
    Fetches a GitHub issue through REST and verifies its body against a file.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [ValidatePattern('^[A-Za-z0-9_.-]+/[A-Za-z0-9_.-]+$')]
    [string]$Repository,

    [Parameter(Mandatory)]
    [ValidateRange(1, [int]::MaxValue)]
    [int]$IssueNumber,

    [Parameter(Mandatory)]
    [string]$ExpectedBodyPath,

    [ValidateRange(1, 100)]
    [int]$MaxAttempts = 6,

    [ValidateRange(0, 300)]
    [int]$DelaySeconds = 5,

    [string]$DiagnosticPath,

    [string]$GitHubCli = 'gh'
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
$PSNativeCommandUseErrorActionPreference = $false

function ConvertTo-NormalizedLineEndings {
    param([AllowEmptyString()][string]$Text)
    return $Text -replace "`r`n|`r", "`n"
}

function Test-EquivalentBody {
    param(
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    if ($Actual -ceq $Expected) {
        return $true
    }
    if ($Actual.EndsWith("`n") -and $Actual.Substring(0, $Actual.Length - 1) -ceq $Expected) {
        return $true
    }
    if ($Expected.EndsWith("`n") -and $Expected.Substring(0, $Expected.Length - 1) -ceq $Actual) {
        return $true
    }
    return $false
}

function Get-Sha256 {
    param([AllowEmptyString()][string]$Text)

    $bytes = [System.Text.UTF8Encoding]::new($false).GetBytes($Text)
    return [Convert]::ToHexString([System.Security.Cryptography.SHA256]::HashData($bytes)).ToLowerInvariant()
}

function Get-FirstDifference {
    param(
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    $limit = [Math]::Min($Actual.Length, $Expected.Length)
    $offset = 0
    while ($offset -lt $limit -and $Actual[$offset] -ceq $Expected[$offset]) {
        $offset++
    }
    if ($offset -eq $limit -and $Actual.Length -eq $Expected.Length) {
        return $null
    }

    $prefix = $Expected.Substring(0, [Math]::Min($offset, $Expected.Length))
    $line = ([regex]::Matches($prefix, "`n").Count) + 1
    $lastNewline = $prefix.LastIndexOf("`n", [StringComparison]::Ordinal)
    $column = if ($lastNewline -lt 0) { $offset + 1 } else { $offset - $lastNewline }
    return [ordered]@{
        offset = $offset
        line = $line
        column = $column
    }
}

function Test-TerminalGitHubFailure {
    param([string]$Message)
    return $Message -match '(?i)(HTTP\s+(401|403)|authentication|not authorized|resource not accessible)'
}

function Write-Diagnostic {
    param(
        [string]$Reason,
        [int]$Attempts,
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    if ([string]::IsNullOrWhiteSpace($DiagnosticPath)) {
        return
    }

    $parent = Split-Path -Parent $DiagnosticPath
    if (-not [string]::IsNullOrWhiteSpace($parent) -and
        -not (Test-Path -LiteralPath $parent -PathType Container)) {
        New-Item -ItemType Directory -Path $parent | Out-Null
    }

    $diagnostic = [ordered]@{
        schemaVersion = 1
        repository = $Repository
        issueNumber = $IssueNumber
        endpoint = "repos/$Repository/issues/$IssueNumber"
        attempts = $Attempts
        observedAt = (Get-Date).ToUniversalTime().ToString('o')
        reason = $Reason
        expectedLength = $Expected.Length
        actualLength = $Actual.Length
        expectedSha256 = Get-Sha256 $Expected
        actualSha256 = Get-Sha256 $Actual
        firstDifference = Get-FirstDifference -Actual $Actual -Expected $Expected
    }
    $diagnostic | ConvertTo-Json -Depth 4 |
        Set-Content -LiteralPath $DiagnosticPath -Encoding utf8NoBOM
}

if (-not (Test-Path -LiteralPath $ExpectedBodyPath -PathType Leaf)) {
    throw "Expected issue body file not found: $ExpectedBodyPath"
}

$expected = ConvertTo-NormalizedLineEndings (
    Get-Content -LiteralPath $ExpectedBodyPath -Raw
)
$lastReason = ''
$lastActual = ''
$previousConsoleOutputEncoding = [Console]::OutputEncoding
$previousOutputEncoding = $OutputEncoding
$utf8Encoding = [System.Text.UTF8Encoding]::new($false)

try {
    [Console]::OutputEncoding = $utf8Encoding
    $OutputEncoding = $utf8Encoding

    for ($attempt = 1; $attempt -le $MaxAttempts; $attempt++) {
        $output = (& $GitHubCli api "repos/$Repository/issues/$IssueNumber" 2>&1 | Out-String).Trim()
        $exitCode = $LASTEXITCODE
        if ($exitCode -ne 0) {
            $lastReason = "GitHub REST request failed with exit code $exitCode."
            if (Test-TerminalGitHubFailure $output) {
                Write-Diagnostic -Reason $lastReason -Attempts $attempt -Actual '' -Expected $expected
                throw "Unable to fetch issue #$IssueNumber from ${Repository}: $output"
            }
        }
        else {
            try {
                $issue = $output | ConvertFrom-Json
                $lastActual = ConvertTo-NormalizedLineEndings ([string]$issue.body)
                if (Test-EquivalentBody -Actual $lastActual -Expected $expected) {
                    return $issue
                }
                $lastReason = 'GitHub issue body differs from the persisted draft.'
            }
            catch {
                $lastReason = "GitHub REST response was invalid JSON: $($_.Exception.Message)"
            }
        }

        if ($attempt -lt $MaxAttempts) {
            Write-Warning "$lastReason Retrying issue #$IssueNumber body verification ($attempt/$MaxAttempts)."
            if ($DelaySeconds -gt 0) {
                Start-Sleep -Seconds $DelaySeconds
            }
        }
    }

    Write-Diagnostic -Reason $lastReason -Attempts $MaxAttempts -Actual $lastActual -Expected $expected
    $diagnosticSuffix = if ([string]::IsNullOrWhiteSpace($DiagnosticPath)) {
        ''
    }
    else {
        " Diagnostic: $DiagnosticPath"
    }
    throw "Issue #$IssueNumber body verification failed after $MaxAttempts attempts. $lastReason$diagnosticSuffix"
}
finally {
    $OutputEncoding = $previousOutputEncoding
    [Console]::OutputEncoding = $previousConsoleOutputEncoding
}
```

</details>


---

<sub>1m 3s</sub>

### `powershell`

**Validate plan headings and tasks**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $plan = git show 'experiment/shepherd-control:4-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md' | Out-String; $q='## Phase 3 — Ignorance reduction: questions to answer before writing code'; $i='## Phase 4 — Implementation (five serial issues)'; [pscustomobject]@{QuestionsOccurrences=([regex]::Matches($plan,[regex]::Escape($q))).Count;ImplementationOccurrences=([regex]::Matches($plan,[regex]::Escape($i))).Count} | ConvertTo-Json; $start=$plan.IndexOf($i); $end=$plan.IndexOf(\"`n## \",$start+3); if($end -lt 0){$end=$plan.Length}; $section=$plan.Substring($start,$end-$start); [regex]::Matches($section,'(?m)^### (4\\.[0-9]+) — (.+)$') | ForEach-Object { \"$($_.Groups[1].Value)|$($_.Groups[2].Value)\" }",
  "description": "Validate plan headings and tasks",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>10 lines</summary>

```
{
  "QuestionsOccurrences": 1,
  "ImplementationOccurrences": 1
}
4.1|Issue 1: Add the application-layer deadline change operation
4.2|Issue 2: Expose deadline changes through the booking facade
4.3|Issue 3: Implement the deadline editor backing model
4.4|Issue 4: Implement the PrimeFaces deadline dialog
4.5|Issue 5: Integrate deadline editing into the Administration dashboard
<shellId: 4 completed with exit code 0>
```

</details>


---

<sub>1m 4s</sub>

### `powershell`

**Persist child issue baseline**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; gh api 'repos/edburns/dd-3058828-01-cargotracker/issues/4/sub_issues' --paginate | Set-Content -LiteralPath 'C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758\\pre-creation-children.json' -Encoding utf8; Get-Content -Raw -LiteralPath 'C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758\\pre-creation-children.json'",
  "description": "Persist child issue baseline",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

```
[]
<shellId: 5 completed with exit code 0>
```


---

<sub>1m 9s</sub>

### Copilot

All nine implementation-gating questions have substantive resolutions, the plan contains exactly five direct tasks, the parent has no existing children, and this user-owned repository will create children without an issue type. I’m now persisting the complete specifications for pre-mutation validation.

---

<sub>2m 23s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

````json
"*** Begin Patch\n*** Add File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/01-4.1-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `4-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, especially `### Domain acceptance behavior` and `### Hard scope constraints`.\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.1 — Issue 1: Add the application-layer deadline change operation`\n+- `## Cross-cutting concerns`\n+\n+The resolved decisions are binding:\n+\n+- Add `BookingService.changeDeadline(TrackingId, Date)`. Load the cargo, construct a replacement `RouteSpecification` from its existing origin, existing destination, and supplied deadline, call `cargo.specifyNewRoute(...)`, and store it through `cargoRepository.store(...)`. Do not add mutable deadline setters.\n+- Retain the assigned itinerary. Do not clear, replace, or reroute it. Let `Cargo.specifyNewRoute(...)` recalculate delivery and routing state; in the established sequential test, the itinerary stays unchanged and routing status remains `MISROUTED`.\n+- Extend the sequential Arquillian `BookingServiceTest` with `testChangeDeadline()` after `testChangeDestination()`. The Open Liberty build compiles this test but keeps the historical `skipTests=true`; do not modernize Arquillian or add a mocking dependency.\n+\n+Research established that the prepared JDK 17/Open Liberty package path compiles test sources while the historical Arquillian tests remain skipped by default. Treat compilation and the Open Liberty package gate as executable evidence; do not claim the Arquillian test executed unless the documented remote Payara environment is actually available. Implement production code and tests from the plan and repository conventions, not from research artifact source code.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the PR base branch on remote `origin`. This is implementation subsection 4.1 and the first of five serial issues. The issues are assigned, completed, and merged in plan order; do not begin work until this issue is assigned. Later issues may assume this issue is merged and gated.\n+\n+Start from the feature-absent campaign baseline. Do not cherry-pick, copy, or inspect feature-bearing commits or branches. Keep this issue to one coherent application-layer change.\n+\n+## Implement\n+\n+Modify only:\n+\n+- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`\n+- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`\n+- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`\n+\n+Add this application API:\n+\n+```java\n+void changeDeadline(TrackingId trackingId, Date deadline);\n+```\n+\n+Implement it in `DefaultBookingService` by:\n+\n+1. Loading the aggregate with `cargoRepository.find(trackingId)`.\n+2. Reading the current destination from `cargo.getRouteSpecification().getDestination()`.\n+3. Creating a new `RouteSpecification` with `cargo.getOrigin()`, the current destination, and the supplied deadline.\n+4. Calling `cargo.specifyNewRoute(routeSpecification)`.\n+5. Calling `cargoRepository.store(cargo)`.\n+6. Logging the tracking ID and new deadline at `Level.INFO` in the style of `changeDestination(...)`.\n+\n+Write `testChangeDeadline()` first and place it after `testChangeDestination()` in the existing ordered test sequence. Build a deadline one month after the test's original `deadline`, invoke the service, reload using `Cargo.findByTrackingId`, and assert all of the following:\n+\n+- origin remains Chicago;\n+- destination remains Helsinki;\n+- the stored deadline is the same calendar day as requested;\n+- the assigned itinerary is unchanged;\n+- transport status remains `NOT_RECEIVED`;\n+- last known location remains `Location.UNKNOWN`;\n+- current voyage remains `Voyage.NONE`;\n+- the cargo is not misdirected;\n+- estimated time of arrival is `Delivery.ETA_UNKOWN`;\n+- next expected activity is `Delivery.NO_ACTIVITY`;\n+- the cargo is not unloaded at destination;\n+- routing status remains `MISROUTED`.\n+\n+Use calendar-day comparison consistent with the existing historical test style; do not introduce a timezone policy.\n+\n+## Completion gates\n+\n+- The complete new test source compiles in the existing test suite.\n+- `.\\mvnw.cmd clean package -Popenliberty` succeeds on JDK 17.\n+- Review the diff and confirm no web, facade, REST, Liberty, Derby, or persistence configuration file changed.\n+- Confirm the test proves both the intended deadline change and preservation of origin, destination, itinerary, and delivery-derived state.\n+- Preserve Java EE 7, `javax.*`, and the repository's Java 7 source/target level.\n+\n+## Out of scope\n+\n+- JSF, PrimeFaces, facade, dialog, and dashboard changes.\n+- A setter on `Cargo` or `RouteSpecification`.\n+- Direct persistence-field updates or bypassing the aggregate.\n+- Clearing or replacing the itinerary, automatic rerouting, or destination/origin changes.\n+- New chronological rules for deadlines.\n+- Arquillian/Payara modernization, new test frameworks, dependency upgrades, or runtime/configuration changes.\n+- Unrelated booking, routing, tracking, messaging, batch, REST, or persistence redesign.\n*** Add File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/02-4.2-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `4-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, especially `### Domain acceptance behavior` and `### Hard scope constraints`.\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.2 — Issue 2: Expose deadline changes through the booking facade`\n+- `## Cross-cutting concerns`\n+\n+The resolved decisions are binding:\n+\n+- The application operation already merged from Issue 1 owns the aggregate mutation: replacement `RouteSpecification`, `Cargo.specifyNewRoute(...)`, and repository storage.\n+- Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to `BookingServiceFacade`. `DefaultBookingServiceFacade` converts only the identifier with `new TrackingId(trackingId)` and passes the same `Date` to `BookingService.changeDeadline(...)`.\n+- Do not introduce a command DTO, formatted-string service parameter, domain type in the web-facing facade contract, or repository work in the facade.\n+- The prepared Open Liberty build compiles tests but retains historical `skipTests=true`; do not modernize Arquillian or add a mocking dependency.\n+\n+Research established that JDK 17/Open Liberty packaging is the mandatory build gate and that container-free delegation coverage must use repository-compatible hand-written fakes if practical. Implement from production interfaces and conventions rather than research artifact source code.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the PR base branch on remote `origin`. This is implementation subsection 4.2 and the second of five serial issues. The issues are assigned, completed, and merged in plan order; do not begin until this issue is assigned and Issue 1 is present on the base branch.\n+\n+Do not modify or weaken the application-layer implementation or test delivered by Issue 1. Do not cherry-pick, copy, or inspect feature-bearing commits or branches.\n+\n+## Implement\n+\n+Modify:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`\n+\n+Optionally add, if it fits the existing test harness without new dependencies:\n+\n+- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`\n+\n+Add this facade API:\n+\n+```java\n+void changeDeadline(String trackingId, Date arrivalDeadline);\n+```\n+\n+Implement exact one-step delegation:\n+\n+```java\n+bookingService.changeDeadline(\n+        new TrackingId(trackingId),\n+        arrivalDeadline);\n+```\n+\n+Keep the facade boundary narrow: presentation clients supply a string ID and `java.util.Date`; the facade converts the ID and delegates exactly once. It must not load or mutate `Cargo`, access `CargoRepository`, parse UI text, or use JSF/PrimeFaces classes.\n+\n+If a focused test is practical, use a hand-written `BookingService` fake or spy to prove:\n+\n+- the tracking string becomes an equivalent `TrackingId`;\n+- the identical `Date` object/value reaches the application service;\n+- delegation occurs exactly once;\n+- the facade performs no duplicate repository or domain mutation.\n+\n+Do not distort production visibility or APIs merely to enable the optional test.\n+\n+## Completion gates\n+\n+- Existing facade consumers and all test sources compile.\n+- `.\\mvnw.cmd clean package -Popenliberty` succeeds on JDK 17.\n+- The application-layer test from Issue 1 remains unchanged and compiling.\n+- A focused test, if added, discriminates identifier conversion and exact-once delegation; it must not merely assert that a method returns normally.\n+- Review the diff to confirm it contains no repository access, formatted-date parsing, JSF/PrimeFaces type, domain DTO leakage, or unrelated file changes.\n+- Preserve Java EE 7, `javax.*`, and the Java 7 source/target level.\n+\n+## Out of scope\n+\n+- Reimplementing the domain mutation in the facade.\n+- JSF beans, dynamic-dialog launchers, XHTML, or dashboard integration.\n+- New command DTOs, string date formats, mapping frameworks, Mockito, or other dependencies.\n+- Changes to Issue 1's application test or aggregate semantics.\n+- Arquillian/Payara modernization or Open Liberty, Derby, REST, batch, and persistence configuration changes.\n+- Unrelated facade cleanup or redesign.\n*** Add File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/03-4.3-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `4-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, especially `### User-visible acceptance behavior` and `### Hard scope constraints`.\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.3 — Issue 3: Implement the deadline editor backing model`\n+- `## Cross-cutting concerns`\n+\n+The resolved decisions are binding:\n+\n+- Keep domain types behind `BookingServiceFacade`; it accepts `String` and `java.util.Date`.\n+- Load `CargoRoute` through `BookingServiceFacade.loadCargoForRouting(trackingId)`. Parse the DTO's date-only `cargo.getArrivalDeadlineDate()` with a per-load `new SimpleDateFormat(\"MM/dd/yyyy\")`; do not add shared mutable formatting state or reload a domain object. Surface malformed data explicitly rather than submitting null.\n+- Implement a serializable CDI `@Named @ViewScoped` editor bean. The session-scoped launcher and XHTML belong to Issue 4.\n+- Require a non-null selection, but do not impose a minimum, future, old-deadline, or itinerary-leg chronology rule. Existing `RouteSpecification` invariants remain authoritative.\n+- Container-free tests should use a hand-written facade fake if practical; do not add a mocking dependency.\n+\n+Research established that the DTO's displayed deadline is date-only in `MM/dd/yyyy`, while the broader formatted value starts with the same component. The editor should use the explicit date-only DTO accessor required by this task and a fresh formatter per load. Implement from production contracts, not research artifact source code.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the PR base branch on remote `origin`. This is implementation subsection 4.3 and the third of five serial issues. The issues are assigned, completed, and merged in plan order; do not begin until assigned and Issues 1 and 2 are merged to the base branch.\n+\n+Do not add the launcher, dialog XHTML, or table link early. Do not cherry-pick, copy, or inspect feature-bearing commits or branches.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`\n+\n+Use this required shape:\n+\n+```java\n+@Named\n+@ViewScoped\n+public class ChangeArrivalDeadlineDate implements Serializable {\n+    private static final long serialVersionUID = 1L;\n+\n+    private String trackingId;\n+    private CargoRoute cargo;\n+    private Date arrivalDeadlineDate;\n+\n+    @Inject\n+    private BookingServiceFacade bookingServiceFacade;\n+}\n+```\n+\n+Provide:\n+\n+- `getTrackingId()` and `setTrackingId(String)`;\n+- `getCargo()`;\n+- `getArrivalDeadlineDate()` and `setArrivalDeadlineDate(Date)`;\n+- `load()`;\n+- `changeArrivalDeadline()`.\n+\n+`load()` must:\n+\n+1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.\n+2. Store the returned `CargoRoute`.\n+3. Create a per-load `SimpleDateFormat(\"MM/dd/yyyy\")`.\n+4. Parse `cargo.getArrivalDeadlineDate()`.\n+5. Store the parsed value in `arrivalDeadlineDate`.\n+6. Surface lookup or parse failure as a clear application/view error consistent with existing JSF handling; do not swallow it, print a stack trace, or leave a success-shaped null.\n+\n+`changeArrivalDeadline()` must:\n+\n+1. Reject a null selected date. The XHTML will also mark the component required in Issue 4, but this model must not silently delegate null when called directly.\n+2. Call `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.\n+3. Only after successful return, call `PrimeFaces.current().dialog().closeDynamic(\"DONE\")`.\n+4. Leave the dialog open and surface the failure if facade delegation fails.\n+\n+If practical in the current harness, add a container-free JUnit test with a hand-written fake facade proving:\n+\n+- `load()` requests the exact tracking ID;\n+- `MM/dd/yyyy` converts to the expected editable calendar date;\n+- submission delegates the exact tracking ID and selected date;\n+- malformed DTO data is surfaced rather than converted to null;\n+- null submission is rejected and does not invoke the facade.\n+\n+## Completion gates\n+\n+- The bean is serializable and uses the repository's established CDI `@Named` and JSF `@ViewScoped` annotations.\n+- Its model references facade DTOs only, never `Cargo`, `TrackingId`, `RouteSpecification`, or repositories.\n+- Parse and null-date failures are observable and cannot look like successful updates.\n+- If a focused test is added, it proves the success and failure contracts without a container or new dependency.\n+- `.\\mvnw.cmd clean package -Popenliberty` succeeds on JDK 17.\n+- All earlier application and facade gates remain intact.\n+\n+## Out of scope\n+\n+- The session-scoped launcher, dynamic-dialog XHTML, and Administration table link.\n+- Domain/repository access from the bean.\n+- A new facade DTO or changing `CargoRoute` to expose a `Date`.\n+- Shared `SimpleDateFormat`, new timezone policy, or new chronological validation.\n+- Closing the dialog after failed delegation.\n+- Mocking libraries, Arquillian/Payara modernization, framework migration, and unrelated web cleanup.\n*** Add File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/04-4.4-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `4-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, especially `### User-visible acceptance behavior` and `### Hard scope constraints`.\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog`\n+- `## Cross-cutting concerns`\n+\n+The resolved decisions are binding:\n+\n+- Mirror the Change Destination interaction with a serializable JSF managed `@SessionScoped` launcher named `changeArrivalDeadlineDateDialog`; the CDI view-scoped editor is already present from Issue 3.\n+- Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with one `trackingId` request parameter. Options are `modal=true`, `draggable=true`, `resizable=false`, `contentWidth=410`, and `contentHeight=280`.\n+- Successful submission closes with `\"DONE\"`; cancellation closes with `\"\"`. A `dialogReturn` handler supports refreshing `tableNotRouted`.\n+- Put `<f:metadata>` directly under root `<html>`, before `<h:head>` and `<h:body>`, because MyFaces requires view metadata at `UIViewRoot` scope.\n+- Require a date but add no new chronological business rule.\n+- Open Liberty package/start, HTTP checks, and browser behavior are mandatory; do not modernize the historical remote-Payara Arquillian runtime.\n+\n+Research established that incorrect metadata nesting causes MyFaces `TagException`/parent-component failures and that the prepared baseline intentionally places metadata at the view root. Preserve that structure. Implement the dialog from production patterns and the contract above, not research artifact source code.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the PR base branch on remote `origin`. This is implementation subsection 4.4 and the fourth of five serial issues. The issues are assigned, completed, and merged in plan order; do not begin until assigned and Issues 1 through 3 are merged to the base branch.\n+\n+The dashboard link belongs to Issue 5. This issue must make the dialog work by direct URL without integrating it into the table. Do not cherry-pick, copy, or inspect feature-bearing commits or branches.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`\n+- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`\n+\n+The launcher must be serializable and use:\n+\n+```java\n+@ManagedBean(name = \"changeArrivalDeadlineDateDialog\")\n+@SessionScoped\n+```\n+\n+Implement `showDialog(String trackingId)`, `handleReturn(SelectEvent event)`, and `cancel()`. Follow the adjacent destination-dialog production pattern while applying this issue's explicit contract:\n+\n+- create the five exact dialog options above;\n+- pass `trackingId` through `Map<String, List<String>>`;\n+- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`;\n+- close cancellation with an empty string and never call the facade from `cancel()`;\n+- preserve a return handler suitable for the caller's `dialogReturn` Ajax event.\n+\n+The XHTML title must be `Change Deadline`. Put this metadata directly beneath root `<html>` and before `<h:head>`:\n+\n+```xhtml\n+<f:metadata>\n+    <f:viewParam name=\"trackingId\"\n+                 value=\"#{changeArrivalDeadlineDate.trackingId}\"/>\n+    <f:viewAction action=\"#{changeArrivalDeadlineDate.load}\"/>\n+</f:metadata>\n+```\n+\n+Build a labeled form that displays:\n+\n+- `Origin:` with `#{changeArrivalDeadlineDate.cargo.originName}`;\n+- `Destination:` with `#{changeArrivalDeadlineDate.cargo.finalDestinationName}`;\n+- `Deadline:` with a required `p:datePicker` bound to `#{changeArrivalDeadlineDate.arrivalDeadlineDate}`;\n+- **Cancel** invoking `#{changeArrivalDeadlineDateDialog.cancel()}`;\n+- **Update** invoking `#{changeArrivalDeadlineDate.changeArrivalDeadline()}`.\n+\n+Provide visible validation feedback associated with the date input. Do not close on failed validation or failed facade delegation. Keep the caller-refresh contract compatible with the existing destination dialog; actual table wiring remains Issue 5.\n+\n+## Completion gates\n+\n+- `.\\mvnw.cmd clean package -Popenliberty liberty:run` starts successfully on JDK 17.\n+- A direct request to `http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789` returns HTTP 200.\n+- The direct view renders title **Change Deadline**, origin, destination, and the existing selected deadline.\n+- Server and page evidence contains no `TagException`, `Parent UIComponent`, `FacesException`, or feature-caused server error.\n+- Cancel leaves the persisted deadline unchanged.\n+- Update changes the deadline, closes only after success, and a repeated direct load initializes to the changed value.\n+- Existing destination editing still works.\n+- Stop Liberty cleanly before completing the issue.\n+\n+## Out of scope\n+\n+- Modifying `listNotRouted.xhtml` or adding the dashboard affordance.\n+- Navigation to a full page, inline cell editing, or a different UI framework.\n+- Additional request parameters or different dialog dimensions/results.\n+- Metadata inside `<h:body>`.\n+- New date chronology rules, timezone policy, facade/domain redesign, or repository access from the web layer.\n+- Arquillian/Payara modernization, dependency upgrades, and unrelated Liberty/configuration changes.\n*** Add File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/05-4.5-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `4-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### User-visible acceptance behavior`, `### Domain acceptance behavior`, and `### Hard scope constraints`.\n+- `### 3.1 — Which cargos expose the edit operation?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard`\n+- `## Phase 5 — Documentation and implementation handoff`\n+- `## Cross-cutting concerns`\n+\n+The resolved decisions are binding:\n+\n+- Expose editing only in `src/main/webapp/admin/tables/listNotRouted.xhtml`; do not add it to routed, misrouted, claimed, details, or other tables. The already-merged application/facade operations remain generally callable for a valid tracking ID.\n+- Mirror the existing Change Destination dynamic-dialog interaction.\n+- The established dialog uses `trackingId`, closes successful updates with `\"DONE\"` and cancellation with `\"\"`, and returns through `dialogReturn` to refresh `tableNotRouted`.\n+- Require a non-null date but add no new chronological business rule.\n+- Mandatory evidence is JDK 17/Open Liberty build/start, HTTP checks, and the complete `DEF789` browser flow. The historical Arquillian suite stays skipped unless its documented remote Payara environment is available.\n+\n+Research established that the prepared baseline's destination column is the compatible command-link/dialog-return pattern and that transient JMS activation-order warnings are acceptable only when every endpoint later activates. Do not copy research artifact source code; implement against the existing production destination column and the explicit requirements below.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the PR base branch on remote `origin`. This is implementation subsection 4.5 and the fifth and final serial issue. The issues are assigned, completed, and merged in plan order; do not begin until assigned and Issues 1 through 4 are merged to the base branch.\n+\n+Preserve all prior gates. Do not cherry-pick, copy, or inspect feature-bearing commits or branches.\n+\n+## Implement\n+\n+Modify:\n+\n+- `src/main/webapp/admin/tables/listNotRouted.xhtml`\n+\n+In the existing Deadline column, replace plain deadline text with a `p:commandLink` that:\n+\n+- invokes `#{changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)}`;\n+- continues displaying `#{cargoNotRouted.arrivalDeadlineDate}`;\n+- uses the existing Font Awesome edit-icon styling from the adjacent Destination column;\n+- has a stable component ID such as `arrivalDeadlineToUpdate`;\n+- attaches a `dialogReturn` Ajax listener;\n+- invokes `#{changeArrivalDeadlineDateDialog.handleReturn}`;\n+- updates `tableNotRouted`;\n+- exposes exactly this tooltip: `Click to change cargo arrival deadline date.`\n+\n+Follow the adjacent Destination column's structure and styling without changing destination editing, tracking-ID links, or routing behavior. Keep the affordance confined to the Not Routed Cargo table.\n+\n+Update `README.md` only if it already enumerates user-facing Administration capabilities. If it does, add one concise sentence that administrators can change an unrouted cargo's arrival deadline; otherwise leave it unchanged.\n+\n+In the PR acceptance evidence, record:\n+\n+- exact command `.\\mvnw.cmd clean package -Popenliberty liberty:run`;\n+- sample cargo `DEF789`;\n+- before and after displayed deadline values;\n+- that data is in-memory and resets on rebuild/restart.\n+\n+## Completion gates\n+\n+- Start from a clean JDK 17 build with `.\\mvnw.cmd clean package -Popenliberty liberty:run`.\n+- Confirm the home page returns HTTP 200 and Administration renders.\n+- Locate `DEF789`, record its original deadline, and confirm the deadline link has an edit icon and exact tooltip.\n+- Open the dialog and confirm origin/destination identify `DEF789` and the current deadline is selected.\n+- Choose a visibly different date, press **Update**, and confirm the dialog closes, `tableNotRouted` refreshes, and the selected date appears.\n+- Reload the page and confirm the date persists for the running in-memory application.\n+- Reopen the dialog and confirm it initializes to the changed date.\n+- Press **Cancel** and confirm no further change.\n+- Confirm the Destination edit dialog still opens and selecting `DEF789` for routing does not produce an error page.\n+- Confirm logs contain none of: `<f:metadata> Parent UIComponent`, `TagException`, `VerifyError`, `FacesException`, `CWWKZ0002E`, `CWWKZ0003E`, recurring batch authorization failures, or new feature-attributable FFDC files.\n+- Accept transient JMS activation-order warnings only if every message endpoint subsequently activates.\n+- Run the final `.\\mvnw.cmd clean package -Popenliberty` gate, preserving compilation of existing and new test sources.\n+- Confirm no Java EE namespace migration and no regression to Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST compatibility fixes.\n+- Stop Liberty cleanly.\n+\n+## Out of scope\n+\n+- Deadline links in any table or page other than Not Routed Cargo.\n+- Changes to destination editing, tracking links, routing selection, or completed application/facade/dialog contracts.\n+- New date chronology, authorization, cargo-lifecycle, or timezone policies.\n+- Java EE/Jakarta migration, framework or dependency upgrades, Open Liberty/Derby changes, or Arquillian modernization.\n+- Unrelated dashboard redesign, styling cleanup, or broader documentation.\n*** End Patch\n"
````

</details>

```
Added 5 file(s): C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\01-4.1-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\02-4.2-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\03-4.3-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\04-4.4-body.md, C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\05-4.5-body.md
```


---

<sub>2m 37s</sub>

### `powershell`

**Validate drafts and initialize logs**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758'; $bodyDir=Join-Path $logDir 'issue-bodies'; & 'C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1' -BodyDirectory $bodyDir -ExpectedCount 5 -LessonPropagation off | Select-Object Name,Length; $ledger='[]'; $result=[ordered]@{schemaVersion=1;status='in_progress';ledgerFile='creation-ledger.json';operationError=$null} | ConvertTo-Json; foreach($item in @(@{Path=(Join-Path $logDir 'creation-ledger.json');Content=$ledger},@{Path=(Join-Path $logDir 'stage-20-result.json');Content=$result})){ $tmp=\"$($item.Path).tmp\"; [System.IO.File]::WriteAllText($tmp,$item.Content,[System.Text.UTF8Encoding]::new($false)); Move-Item -LiteralPath $tmp -Destination $item.Path -Force }; Write-Output 'Draft validation passed; ledger and result initialized.'",
  "description": "Validate drafts and initialize logs",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>9 lines</summary>

```
Name           Length
----           ------
01-4.1-body.md   5647
02-4.2-body.md   4877
03-4.3-body.md   5749
04-4.4-body.md   5997
05-4.5-body.md   6142
Draft validation passed; ledger and result initialized.
<shellId: 7 completed with exit code 0>
```

</details>


---

<sub>2m 37s</sub>

### `powershell`

**Parse all resolution blocks**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $plan = git show 'experiment/shepherd-control:4-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md' | Out-String; $qStart=$plan.IndexOf('## Phase 3 — Ignorance reduction: questions to answer before writing code'); $qEnd=$plan.IndexOf(\"`n## Phase 4\",$qStart); $section=$plan.Substring($qStart,$qEnd-$qStart); $matches=[regex]::Matches($section,'(?ms)^### (?<id>3\\.[0-9]+) — (?<title>.+?)\\r?\\n.*?^\\*\\*Resolution:\\*\\*\\s*(?<resolution>.*?)(?=^### 3\\.[0-9]+ —|\\z)'); if($matches.Count -ne 9){throw \"Expected 9 resolution blocks, found $($matches.Count)\"}; $out=foreach($m in $matches){$r=$m.Groups['resolution'].Value.Trim(); if([string]::IsNullOrWhiteSpace(($r -replace '[*_`#>\\-\\s]',''))){throw \"Empty resolution for $($m.Groups['id'].Value)\"}; \"### $($m.Groups['id'].Value) — $($m.Groups['title'].Value.Trim())`r`n**Resolution:**`r`n$r`r`n\"}; $path='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758\\parsed-resolution-blocks.md'; [System.IO.File]::WriteAllText($path,($out -join ''),[System.Text.UTF8Encoding]::new($false)); Get-Content -Raw -LiteralPath $path",
  "description": "Parse all resolution blocks",
  "initial_wait": 30,
  "mode": "sync"
}
```

</details>

<details>
<summary>77 lines</summary>

```
### 3.1 — Which cargos expose the edit operation?
**Resolution:**
Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.
### 3.2 — What is the exact domain mutation?
**Resolution:**
Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.
### 3.3 — What should happen to an existing itinerary and delivery state?
**Resolution:**
Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.
### 3.4 — What type crosses the facade boundary?
**Resolution:**
Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.
### 3.5 — How is the DTO's formatted deadline converted for editing?
**Resolution:**
Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.
### 3.6 — Which JSF bean scopes and interaction pattern should be used?
**Resolution:**
Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.
### 3.7 — What is the dynamic-dialog contract?
**Resolution:**
Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.
### 3.8 — What date validation is required?
**Resolution:**
Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.
### 3.9 — How will the feature be tested on the prepared historical baseline?
**Resolution:**
Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---
<shellId: 6 completed with exit code 0>
```

</details>


---

<sub>2m 36s</sub>

### `sql`

**Advance drafting work**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Advance drafting work",
  "query": "UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id='validate-stage20'; UPDATE todos SET status='in_progress', updated_at=CURRENT_TIMESTAMP WHERE id='draft-stage20'"
}
```

</details>

<details>
<summary>5 lines</summary>

```
Executed 2 statement(s):

1. UPDATE
   1 row(s) updated.

2. UPDATE
   1 row(s) updated.
```

</details>


---

<sub>2m 53s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

```json
"*** Begin Patch\n*** Update File: 4-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260902-1758/issue-bodies/03-4.3-body.md\n@@\n-- Load `CargoRoute` through `BookingServiceFacade.loadCargoForRouting(trackingId)`. Parse the DTO's date-only `cargo.getArrivalDeadlineDate()` with a per-load `new SimpleDateFormat(\"MM/dd/yyyy\")`; do not add shared mutable formatting state or reload a domain object. Surface malformed data explicitly rather than submitting null.\n+- Load `CargoRoute` through `BookingServiceFacade.loadCargoForRouting(trackingId)` and use a per-load `new SimpleDateFormat(\"MM/dd/yyyy\")`; do not add shared mutable formatting state or reload a domain object. Resolution 3.5 records that parsing the leading date of `cargo.getArrivalDeadline()` yields the displayed date because that string begins with `MM/dd/yyyy`. The more specific required load contract in subsection 4.3 directs this issue to parse `cargo.getArrivalDeadlineDate()`, so use that date-only accessor. Surface malformed data explicitly rather than submitting null.\n*** End Patch\n"
```

</details>

```
Modified 1 file(s): C:\Users\edburns\workareas\dd-3058828-01-cargotracker-shepherd-control\4-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260902-1758\issue-bodies\03-4.3-body.md
```


---

<sub>2m 56s</sub>

### `sql`

**Advance issue creation**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Advance issue creation",
  "query": "UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id='draft-stage20'; UPDATE todos SET status='in_progress', updated_at=CURRENT_TIMESTAMP WHERE id='create-stage20'"
}
```

</details>

<details>
<summary>5 lines</summary>

```
Executed 2 statement(s):

1. UPDATE
   1 row(s) updated.

2. UPDATE
   1 row(s) updated.
```

</details>


---

<sub>3m 1s</sub>

### Copilot

The five persisted specifications pass the draft contract and the durable ledger is initialized. I’m creating, body-verifying, and linking each unassigned child serially in plan order.

---

<sub>3m 24s</sub>

### `powershell`

**Create and link child issues**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $PSNativeCommandUseErrorActionPreference=$false; $utf8=[System.Text.UTF8Encoding]::new($false); [Console]::OutputEncoding=$utf8; $OutputEncoding=$utf8; $repo='edburns/dd-3058828-01-cargotracker'; $parent=4; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758'; $bodyDir=Join-Path $logDir 'issue-bodies'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $resultPath=Join-Path $logDir 'stage-20-result.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; function Write-AtomicJson([string]$Path,$Value){$tmp=\"$Path.tmp\"; $json=$Value | ConvertTo-Json -Depth 10; [System.IO.File]::WriteAllText($tmp,$json,$utf8); Move-Item -LiteralPath $tmp -Destination $Path -Force}; function Load-Ledger(){return @((Get-Content -Raw -LiteralPath $ledgerPath | ConvertFrom-Json))}; & 'C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1' -BodyDirectory $bodyDir -ExpectedCount 5 -LessonPropagation off | Out-Null; $tasks=@([ordered]@{Subsection='4.1';File='01-4.1-body.md';Title='4.1 — Add the application-layer deadline change operation'},[ordered]@{Subsection='4.2';File='02-4.2-body.md';Title='4.2 — Expose deadline changes through the booking facade'},[ordered]@{Subsection='4.3';File='03-4.3-body.md';Title='4.3 — Implement the deadline editor backing model'},[ordered]@{Subsection='4.4';File='04-4.4-body.md';Title='4.4 — Implement the PrimeFaces deadline dialog'},[ordered]@{Subsection='4.5';File='05-4.5-body.md';Title='4.5 — Integrate deadline editing into the Administration dashboard'}); $operation='initialization'; try { foreach($task in $tasks){ $body=Join-Path $bodyDir $task.File; $operation=\"create $($task.Subsection)\"; $createdText=(& gh api \"repos/$repo/issues\" -X POST -f \"title=$($task.Title)\" -F \"body=@$body\" --jq '{id,number,node_id,html_url,title}' 2>&1 | Out-String).Trim(); if($LASTEXITCODE -ne 0){throw \"GitHub issue creation failed: $createdText\"}; $created=$createdText | ConvertFrom-Json; $ledger=Load-Ledger; $entry=[ordered]@{implementationSubsection=$task.Subsection;bodyFile=\"issue-bodies/$($task.File)\";id=[long]$created.id;number=[int]$created.number;title=[string]$created.title;url=[string]$created.html_url;body_verified=$false;linked=$false}; $ledger=@($ledger)+@([pscustomobject]$entry); Write-AtomicJson $ledgerPath $ledger; $operation=\"verify body for issue #$($created.number)\"; $verified=& $verifier -Repository $repo -IssueNumber ([int]$created.number) -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($created.number)-body-verification-failure.json\"); if(-not $verified){throw \"Body verifier returned no issue for #$($created.number)\"}; $ledger=Load-Ledger; $ledger[-1].body_verified=$true; Write-AtomicJson $ledgerPath $ledger; $operation=\"link issue #$($created.number)\"; $linked=$false; $linkError=''; for($attempt=1;$attempt -le 3;$attempt++){ $payload=(@{sub_issue_id=[long]$created.id}|ConvertTo-Json -Compress); $linkText=($payload | gh api \"repos/$repo/issues/$parent/sub_issues\" -X POST --input - 2>&1 | Out-String).Trim(); if($LASTEXITCODE -eq 0){$linked=$true;break}; $linkError=$linkText; if($attempt -lt 3){Start-Sleep -Seconds 2} }; if(-not $linked){throw \"GitHub sub-issue linking failed after 3 attempts: $linkError\"}; $ledger=Load-Ledger; $ledger[-1].linked=$true; Write-AtomicJson $ledgerPath $ledger; Write-Output \"Created, verified, and linked #$($created.number): $($created.title)\" } } catch { $failure=\"$operation — $($_.Exception.Message)\"; $ledger=Load-Ledger; try{$childrenText=(& gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate 2>&1 | Out-String).Trim(); if($LASTEXITCODE -eq 0){$children=@($childrenText|ConvertFrom-Json); $ids=@($children|ForEach-Object{[long]$_.id}); foreach($entry in $ledger){$entry.linked=($ids -contains [long]$entry.id)}; Write-AtomicJson $ledgerPath $ledger}}catch{}; $failed=[ordered]@{schemaVersion=1;status='failed';ledgerFile='creation-ledger.json';operationError=$failure}; Write-AtomicJson $resultPath $failed; Write-Output \"FAILED: $failure\"; $ledger | Format-Table number,title,url,bodyFile,body_verified,linked -AutoSize | Out-String | Write-Output; if($ledger.Count -eq 0){Write-Output 'No issues were created; no cleanup is required.'}else{foreach($entry in $ledger){Write-Output \"gh issue delete $($entry.number) --repo `\"$repo`\" --yes\"}; Write-Output 'The operation did not complete. No automatic rollback was performed. Delete every issue in the ledger before invoking the skill again.'}; exit 1 }; Get-Content -Raw -LiteralPath $ledgerPath",
  "description": "Create and link child issues",
  "initial_wait": 120,
  "mode": "sync"
}
```

</details>

<details>
<summary>58 lines</summary>

```
Created, verified, and linked #10: 4.1 — Add the application-layer deadline change operation
Created, verified, and linked #11: 4.2 — Expose deadline changes through the booking facade
Created, verified, and linked #12: 4.3 — Implement the deadline editor backing model
Created, verified, and linked #13: 4.4 — Implement the PrimeFaces deadline dialog
Created, verified, and linked #14: 4.5 — Integrate deadline editing into the Administration dashboard
[
  {
    "implementationSubsection": "4.1",
    "bodyFile": "issue-bodies/01-4.1-body.md",
    "id": 5330915388,
    "number": 10,
    "title": "4.1 — Add the application-layer deadline change operation",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/10",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.2",
    "bodyFile": "issue-bodies/02-4.2-body.md",
    "id": 5330915557,
    "number": 11,
    "title": "4.2 — Expose deadline changes through the booking facade",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/11",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.3",
    "bodyFile": "issue-bodies/03-4.3-body.md",
    "id": 5330915736,
    "number": 12,
    "title": "4.3 — Implement the deadline editor backing model",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/12",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.4",
    "bodyFile": "issue-bodies/04-4.4-body.md",
    "id": 5330915906,
    "number": 13,
    "title": "4.4 — Implement the PrimeFaces deadline dialog",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/13",
    "body_verified": true,
    "linked": true
  },
  {
    "implementationSubsection": "4.5",
    "bodyFile": "issue-bodies/05-4.5-body.md",
    "id": 5330916044,
    "number": 14,
    "title": "4.5 — Integrate deadline editing into the Administration dashboard",
    "url": "https://github.com/edburns/dd-3058828-01-cargotracker/issues/14",
    "body_verified": true,
    "linked": true
  }
]
<shellId: 8 completed with exit code 0>
```

</details>


---

<sub>3m 28s</sub>

### Copilot

All five children are created, their bodies match the persisted drafts, and each is linked to #4. I’m performing the final server-side ordering, state, assignee, and repeated body postconditions before marking the stage complete.

---

<sub>3m 42s</sub>

### `powershell`

**Verify final issue postconditions**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $PSNativeCommandUseErrorActionPreference=$false; $utf8=[System.Text.UTF8Encoding]::new($false); [Console]::OutputEncoding=$utf8; $OutputEncoding=$utf8; $repo='edburns/dd-3058828-01-cargotracker'; $parent=4; $logDir='C:\\Users\\edburns\\workareas\\dd-3058828-01-cargotracker-shepherd-control\\4-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260902-1758'; $ledgerPath=Join-Path $logDir 'creation-ledger.json'; $resultPath=Join-Path $logDir 'stage-20-result.json'; $baselinePath=Join-Path $logDir 'pre-creation-children.json'; $verifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'; function Write-AtomicJson([string]$Path,$Value){$tmp=\"$Path.tmp\"; [System.IO.File]::WriteAllText($tmp,($Value|ConvertTo-Json -Depth 10),$utf8); Move-Item -LiteralPath $tmp -Destination $Path -Force}; $ledger=@((Get-Content -Raw -LiteralPath $ledgerPath|ConvertFrom-Json)); $operation='final postcondition verification'; try { $baseline=@((Get-Content -Raw -LiteralPath $baselinePath|ConvertFrom-Json)); $childrenText=(& gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate 2>&1|Out-String).Trim(); if($LASTEXITCODE -ne 0){throw \"Unable to list final children: $childrenText\"}; $children=@($childrenText|ConvertFrom-Json); if($children.Count -ne ($baseline.Count+$ledger.Count)){throw \"Child count is $($children.Count), expected $($baseline.Count+$ledger.Count)\"}; $newChildren=@($children|Where-Object{[long]$_.id -in @($ledger|ForEach-Object{[long]$_.id})}); if($newChildren.Count -ne $ledger.Count){throw 'Not every ledger issue appears exactly once in parent children'}; for($i=0;$i -lt $ledger.Count;$i++){if([long]$newChildren[$i].id -ne [long]$ledger[$i].id){throw \"New child order mismatch at position $($i+1)\"}; if(-not $ledger[$i].linked -or -not $ledger[$i].body_verified){throw \"Ledger flags incomplete for issue #$($ledger[$i].number)\"}; $body=Join-Path $logDir $ledger[$i].bodyFile; $issue=& $verifier -Repository $repo -IssueNumber ([int]$ledger[$i].number) -ExpectedBodyPath $body -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($ledger[$i].number)-body-verification-failure.json\"); if([string]$issue.state -ne 'open'){throw \"Issue #$($ledger[$i].number) is not open\"}; if(@($issue.assignees).Count -ne 0){throw \"Issue #$($ledger[$i].number) is assigned\"}; if([long]$issue.id -ne [long]$ledger[$i].id){throw \"Issue identity mismatch for #$($ledger[$i].number)\"} }; $complete=[ordered]@{schemaVersion=1;status='complete';ledgerFile='creation-ledger.json';operationError=$null}; Write-AtomicJson $resultPath $complete; [ordered]@{baselineChildCount=$baseline.Count;finalChildCount=$children.Count;newChildNumbers=@($newChildren.number);newChildOrder=@($newChildren.title);allOpen=$true;allUnassigned=$true;allBodiesVerified=$true;issueType='none';stageResult=$complete}|ConvertTo-Json -Depth 6 } catch { $failure=\"$operation — $($_.Exception.Message)\"; try{$childrenText=(& gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate 2>&1|Out-String).Trim(); if($LASTEXITCODE -eq 0){$children=@($childrenText|ConvertFrom-Json);$ids=@($children|ForEach-Object{[long]$_.id});foreach($entry in $ledger){$entry.linked=($ids -contains [long]$entry.id)};Write-AtomicJson $ledgerPath $ledger}}catch{}; Write-AtomicJson $resultPath ([ordered]@{schemaVersion=1;status='failed';ledgerFile='creation-ledger.json';operationError=$failure}); Write-Output \"FAILED: $failure\"; $ledger|Format-Table number,title,url,bodyFile,body_verified,linked -AutoSize|Out-String|Write-Output; foreach($entry in $ledger){Write-Output \"gh issue delete $($entry.number) --repo `\"$repo`\" --yes\"}; Write-Output 'The operation did not complete. No automatic rollback was performed. Delete every issue in the ledger before invoking the skill again.'; exit 1 }",
  "description": "Verify final issue postconditions",
  "initial_wait": 120,
  "mode": "sync"
}
```

</details>

<details>
<summary>29 lines</summary>

```
{
  "baselineChildCount": 0,
  "finalChildCount": 5,
  "newChildNumbers": [
    10,
    11,
    12,
    13,
    14
  ],
  "newChildOrder": [
    "4.1 — Add the application-layer deadline change operation",
    "4.2 — Expose deadline changes through the booking facade",
    "4.3 — Implement the deadline editor backing model",
    "4.4 — Implement the PrimeFaces deadline dialog",
    "4.5 — Integrate deadline editing into the Administration dashboard"
  ],
  "allOpen": true,
  "allUnassigned": true,
  "allBodiesVerified": true,
  "issueType": "none",
  "stageResult": {
    "schemaVersion": 1,
    "status": "complete",
    "ledgerFile": "creation-ledger.json",
    "operationError": null
  }
}
<shellId: 9 completed with exit code 0>
```

</details>


---

<sub>3m 48s</sub>

### `sql`

**Complete stage twenty work**

<details>
<summary>Arguments</summary>

```json
{
  "description": "Complete stage twenty work",
  "query": "UPDATE todos SET status='done', updated_at=CURRENT_TIMESTAMP WHERE id IN ('create-stage20','verify-stage20')"
}
```

</details>

```
2 row(s) updated.
```


---

<sub>3m 51s</sub>

### Copilot

Created five ordered, unassigned child issues under #4, **without an issue type**.

| Subsection | Issue | Title |
|---|---:|---|
| 4.1 | [#10](https://github.com/edburns/dd-3058828-01-cargotracker/issues/10) | Add the application-layer deadline change operation |
| 4.2 | [#11](https://github.com/edburns/dd-3058828-01-cargotracker/issues/11) | Expose deadline changes through the booking facade |
| 4.3 | [#12](https://github.com/edburns/dd-3058828-01-cargotracker/issues/12) | Implement the deadline editor backing model |
| 4.4 | [#13](https://github.com/edburns/dd-3058828-01-cargotracker/issues/13) | Implement the PrimeFaces deadline dialog |
| 4.5 | [#14](https://github.com/edburns/dd-3058828-01-cargotracker/issues/14) | Integrate deadline editing into the Administration dashboard |

**Ordered issue numbers:** `10, 11, 12, 13, 14`

Suggested next invocation:

```text
Invoke skill `shepherd-task-25-given-list` with:
- CAMPAIGN_ID: 48f8a98a-83f9-466b-aa2e-14edbb4449e9
- LESSON_PROPAGATION: off
- REPO: edburns/dd-3058828-01-cargotracker
- BASE_BRANCH: experiment/shepherd-control
- ISSUE_NUMBERS: 10, 11, 12, 13, 14
- PLAN_DIRECTORY: 4-arrival-deadline-control-remove-before-merge
```

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>
